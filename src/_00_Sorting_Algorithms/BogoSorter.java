package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		
		
		while (!isSorted(array)) {
			int r1 = new Random().nextInt(array.length);
			int r2 = new Random().nextInt(array.length);
			int temp = array[r1];
			array[r1] = array[r2];
			array[r2] = temp;
			display.updateDisplay();
		}
	}
		
	boolean isSorted(int[] array2) {
			for (int i = 0; i < array2.length - 1; i++) {
				if (array2[i] > array2[i + 1]) {
					return false;
				}
			}
			return true;
		}
		
		/*
		int sorted = 1;
		while(sorted != 1) {
		int[] sortedArray = new int[array.length];
		for(int k = 0; k<array.length; k++) {
			sortedArray[k] = array[k];
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length -1; j++) {
				if(sortedArray[j] > sortedArray[j+1]) {
					int t = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = t;
				}
			}
		}
		if(sortedArray != array) {
			int r1 = new Random().nextInt(array.length);
			int r2 = new Random().nextInt(array.length);
			int temp = array[r1];
			array[r1] = array[r2];
			array[r2] = temp;
			
		}
		else {
			sorted = 1;
		}
		
		}*/
	
}
