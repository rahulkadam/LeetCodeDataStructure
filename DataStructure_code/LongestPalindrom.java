package com.DS.sorting;

public class LongestPalindrom {

	public int longestPalindrom(String str , int left , int right) {
		
		if(right-left == 0){
			return 1;
		}
		if(right - left ==1 && str.charAt(left) == str.charAt(right) ) {
			return 2;
		}
		
		if(str.charAt(left) == str.charAt(right)) {
			return longestPalindrom(str, left+1, right-1) + 2;
		}
		
		return max(longestPalindrom(str, left, right-1) , longestPalindrom(str, left+1, right));
	}
	
	//BA
	//  
	//
	//
	//
	public int iterativeLongest(String str , int left , int right) {
		
		int cache[][] = new int[right+1][right+1];
		int i,j,cl;
		
		for( i =0; i<= right ; i++) {
			cache[i][i] = 1;
		}
		
		for(cl = 2; cl <= right ; cl++) {
			for(i = 0; i < right-cl ; i++) {
				 j = i +cl -1;
			}
		}
		
		return cache[right][right];
	}
	
	public int max(int a , int b) {
		if(a<b){
			return b;
		}
		return a;
	}
	
	
}
