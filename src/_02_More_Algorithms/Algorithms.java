package _02_More_Algorithms;

import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {

		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;

	}

	public static int countPearls(List<Boolean> oysters) {
		int c = 0;
		for(int i = 0; i<oysters.size(); i++) {
			if(oysters.get(i) == true) {
				c++;
			}
		}
		
		return c;
	}
	
	public static double findTallest(List<Double> peeps) {
		double tallest = 0.0;
		for(int i = 0; i<peeps.size(); i++){
			if(peeps.get(i)> tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
		
	}
	
	public static String findLongestWord(List<String> words) {
		String longestWord = "";
		for(int i = 0; i<words.size(); i++) {
			if(words.get(i).length()>longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
		
	}
	
	public static boolean containsSOS(List<String> morse) {
		boolean answer = false;
		for(int i = 0; i<morse.size(); i++) {
			if(morse.get(i).contains("... --- ...")) {
				answer = true;
			}
		}
		return answer;
	}
}
