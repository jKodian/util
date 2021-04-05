package jkod.util.matrix;

/**
 * Class created to display a matrix for debugging process. Prints matrix properly containing positive integers with upto 3 digit numbers 
 * @author Jitin
 *
 */
public class DisplayMatrix {

	public static void printArray(int[] array) {
		printColumns(array.length);
		printBottomLine(array.length);
	}
	
	public static void printArray(int[][] array) {
		printColumns(array[0].length);
		printBottomLine(array[0].length);
	}
	
	private static void printColumns(int length) {
		for (int i = 0; i < length; i++) {
			printNumber(i);
		}
	}
	
	private static void printNumber(int number) {
		if(number <= 9) {
			System.out.print("   "+ number + "|" );
		}
		else if(number <= 99) {
			System.out.print("  "+ number + "|" );
		}
		else {
			System.out.print(" "+ number + "|" );
		}
	}
	
	private static void printBottomLine(int size) {
		System.out.println();
		for (int i = 0; i < size*5; i++) {
			System.out.print("\u203E");
		}
	}
	
}
