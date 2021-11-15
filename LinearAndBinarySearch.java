package sorting;

import java.util.Scanner;

public class LinearAndBinarySearch {
	
	public static void main(String[] args) {
		
		String[] theList = { "Test", "Second", "Cool", "Algorithm", "Hello World!", "Java" };
		
		// Get the user input
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Linear Word Search");
		System.out.println("");
		System.out.println("What word would you like to find: ");
		String findThis = scan.nextLine();
		
		// Linear Seatch
		
		for (int i = 0; i < theList.length; i ++) {
			
			if (theList[i].equals(findThis)) {
				
				System.out.println("The word has been found at " + i);
				break;
			};
			
			if (i == theList.length - 1) {
				System.out.println("Word is not in the list");
			}
		}
		
		// Binary Search
		
		int[] intList = {1, 2, 33, 51, 66, 71, 82, 83};

		System.out.println("");
		System.out.println("Binary Integer Search");
		System.out.println("");
		System.out.println("What int would you like to find: ");
		
		int findInt = scan.nextInt();
		
		binarySearch(intList, findInt);

	}
	
	
	
	public static int binarySearch(int[] list, int number) {
		
		int left = 0;
		int right = list.length;
		
		// We should sort the list
	
		int n = list.length;
		int temp = 0;
		
			// Bubble sort
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 1; j < (n-i); j++) {
				
				if(list[j-1] > list[j]) {
				
					temp = list[j-1];
					list[j-1] = list[j];
					list[j] = temp;
				
				}
			}
		}
			
		// Start the search
		
		while (left < right) {
			
			int middle = left + (right - left) / 2;
			
			if (list[middle] == number) {
				System.out.println("Int found at: " + middle);
			}
			
			// On the left side [0, 1, 2, 3, 4, 5]
			
			if (number <= list[middle]) {
				
				right = middle - 1;
				
			}else {
				
				left = middle + 1;
				
			}
			
		}
		
		return -1;
		
	}
	
}