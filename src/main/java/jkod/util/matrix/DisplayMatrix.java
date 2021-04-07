package jkod.util.matrix;

/**
 * Class created to display a matrix for debugging process. Prints matrix properly containing positive integers with upto 3 digit numbers 
 * @author Jitin
 *
 */
public class DisplayMatrix {

	public static void printArray(int[] array) {
		printColumns(array.length);
		printSeperator(array.length);
		printNumber(0);
		for (int i = 0; i < array.length; i++) {
			printNumber(array[i]);
		}
		System.out.println();
		printSeperator(array.length);
	}
	
	public static void printArray(int[][] array) {
		printColumns(array[0].length);
		printSeperator(array[0].length);
		for (int i = 0; i < array.length; i++) {
			printNumber(i);
			for (int j = 0; j < array[0].length; j++) {
				printNumber(array[i][j]);
			}
			System.out.println();
			printSeperator(array.length);
		}
	}
	
	private static void printColumns(int length) {
		System.out.print("    |");									//Padding for adding rows
		for (int i = 0; i < length; i++) {
			printNumber(i);
		}
		System.out.println();
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
	
	private static void printSeperator(int size) {
		System.out.print("\u203E\u203E\u203E\u203E|");				// Overline for the row indexes
		for (int i = 1; i <= size*5; i++) {
			if(i % 5 != 0)
				System.out.print("\u203E");							// Unicode for an overline
			else
				System.out.print("|");
		}
		System.out.println();
	}
	
}
