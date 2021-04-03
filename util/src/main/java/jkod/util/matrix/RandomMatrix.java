package jkod.util.matrix;

import java.util.Random;

public class RandomMatrix {

	private static int[] matrix1D;
	private static int[][] matrix2D;
	
	public static int[] get1DMatrix(int size, int bound) {
		matrix1D = new int[size];
		fillMatrix(size, bound);
		return matrix1D;
	}
	
	public static int[][] get2DMatrix(int rows, int columns, int bound) {
		matrix2D = new int[rows][columns];
		fillMatrix(rows, columns, bound);
		return matrix2D;
	}
	
	private static void fillMatrix(int size, int bound) {
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			matrix1D[i] = rand.nextInt(bound) + 1;
		}
	}
	
	private static void fillMatrix(int rows, int columns, int bound) {
		Random rand = new Random();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix2D[i][j] = rand.nextInt(bound) + 1;	
			}
		}
	}
	
}
