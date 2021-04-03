package jkod.util.matrix;

public class Main {
	
	public static void main(String[] args) {
		int size = 56;
		int[] testArray1D = RandomMatrix.get1DMatrix(size, 100);
		
		
		int rows = 56;
		int columns = 12;
		int[][] testArray2D = RandomMatrix.get2DMatrix(rows, columns, 100);
	}

}
