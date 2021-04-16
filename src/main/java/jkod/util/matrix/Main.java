package jkod.util.matrix;

public class Main {
	
	public static void main(String[] args) {
		
		  int size = 6; 
		  int[] testArray1D = RandomMatrix.get1DMatrix(size, 999);
		  DisplayMatrix.printArray(testArray1D);
		
		  int rows = 10;
		  int columns = 10;
		  int[][] testArray2D = RandomMatrix.get2DMatrix(rows, columns, 100);
		  
		  DisplayMatrix.printArray(testArray2D);
		 
	}

}
