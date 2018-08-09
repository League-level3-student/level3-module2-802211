package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	public static boolean intArraySorted(int[] i) {
		boolean sorted = true;
		int[] check = new int[i.length];
		for (int j = 0; j < i.length; j++) {
			check[j] = i[j];
		}
		for (int k = 0; k < i.length - 1; k++) {
			if (check[k] > check[k + 1]) {
				int temp = check[k + 1];
				check[k + 1] = check[k];
				check[k] = temp;
			} else {

			}

			for (int l = 0; l < i.length; l++) {
				if (check[l] == i[l]) {

				} else {
					sorted = false;
				}
			}
		}

		return sorted;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	public static boolean doubleArraySorted(double[] d) {
		boolean doubleSorted = true;
		double[] check = new double[d.length];
		for (int j = 0; j < d.length; j++) {
			check[j] = d[j];
		}
		for (int k = 0; k < d.length - 1; k++) {
			if (check[k] > check[k + 1]) {
				double temp = check[k + 1];
				check[k + 1] = check[k];
				check[k] = temp;
			} else {

			}

			for (int l = 0; l < d.length; l++) {
				if (check[l] == d[l]) {

				} else {
					doubleSorted = false;
				}
			}
		}

		return doubleSorted;

	}

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)

public static boolean charArraySorted(char[] c) {
	boolean charSorted = true;
	char[] check = new char[c.length];
	for (int j = 0; j < c.length; j++) {
		check[j] = c[j];
	}
	for (int k = 0; k < c.length - 1; k++) {
		if (check[k] > check[k + 1]) {
			char temp = check[k + 1];
			check[k + 1] = check[k];
			check[k] = temp;
		} else {

		}

		for (int l = 0; l < c.length; l++) {
			if (check[l] == c[l]) {

			} else {
				charSorted = false;
			}
		}
	}

	return charSorted;
}
	
	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
public static boolean stringArraySorted(String[] s) {
	boolean stringSorted = true;
	String[] check = new String[s.length];
	for(int i = 0; i<s.length; i++) {
		check[i] = s[i];
	}
	for(int j = 0; j<s.length-1; j++) {
		
		int compare = check[j].compareTo(check[j+1]);
		if(compare > 0) {
			String temp = check[j+1];
			check[j+1] = check[j];
			check[j] = temp;
		}	
	}
	for(int k = 0; k<s.length; k++) {
		if(check[k] == s[k]) {
			
		}
		else {
			stringSorted = false;
		}
	}
	
	
	
	return stringSorted;
}
}
