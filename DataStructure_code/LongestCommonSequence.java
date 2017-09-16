package com.DS.sorting;

public class LongestCommonSequence {

	
	
	// http://www.geeksforgeeks.org/longest-common-subsequence/
	/*
	 * 2
		6 6
		ABCDGH
		AEDFHR
		
		AC
		AB
	 */	
	public int commonInt(String first , String second , int l1 ,  int l2) {
		
		if(l1==0 || l2==0)
			return 0;
		if(first.charAt(l1-1) == second.charAt(l2-1)) {
			return 1 + commonInt(first, second, l1-1, l2-1);
		}
		else {
				return max(commonInt(first, second, l1-1, l2) ,commonInt(first, second, l1, l2-1) );
			}
		
	}
	
	public int max(int a , int b) {
		if(a<b){
			return b;
		}
		return a;
	}
	
	
	
	
	public int dynamic(String first , String second , int l1 ,  int l2) {
		
		int x [][] = new int[l1+1][l2+1];
		
		for(int i =0; i <=l1 ; i++) {
			for(int j=0; j <=l2 ; j++ ) {
				if( i==0 || j==0) {
					x[i][j] = 0;
				}
				else if(first.charAt(i-1) ==second.charAt(j-1)) {
					x[i][j] = x[i-1][j-1]+1;
				}else {
					x[i][j] = max(x[i][j-1] ,x[i-1][j]);
				}
			}
		}
		
		return x[l1][l2];
		
	}
}
