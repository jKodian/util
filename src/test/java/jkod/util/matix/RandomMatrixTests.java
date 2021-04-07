package jkod.util.matix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jkod.util.matrix.RandomMatrix;

public class RandomMatrixTests {

	@Test
	public void get1DMatrix_ProperArguments_Return1DArray() {
		int size = 56;
		int[] testArray = RandomMatrix.get1DMatrix(size, 100);
		
		int count = 0;
		for (int i : testArray) {
			if(i >=1 && i <= 100) {
				count++;
			}
		}
		System.out.println("Size: " + size + ", Actual Size: " + count);
		assertEquals(size, count);
	}
	
	@Test
	public void get2DMatrix_ProperArguments_Return2DArray() {
		int rows = 56;
		int columns = 12;
		int[][] testArray = RandomMatrix.get2DMatrix(rows, columns, 100);
		
		int count = 0;
		for (int[] is : testArray) {
			for (int i : is) {
				if(i >=1 && i <= 100) {
					count++;
				}
			}
		}
		
		System.out.println("Size: " + rows*columns + ", Actual Size: " + count);
		assertEquals(rows*columns, count);
	}
	
}
