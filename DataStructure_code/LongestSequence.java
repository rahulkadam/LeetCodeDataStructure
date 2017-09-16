package com.DS.sorting;

public class LongestSequence {

	static int max = 1;
	static int m =0;
	// 2,3,6,4,5,7,8,0,9
	public int sequence(int arr[] , int n) {
		seq(arr,n);
		
		System.out.println("M : " + m);
		return max;
	}
	
	public int seq(int arr[] , int n) {

		m++;
		if(n==0)
			return 1;
		
		int max_end =1 , res =0;
		
		for(int i=0 ; i < n ; i++ ) {
			
			res = seq(arr, i);
			System.out.println(" Result :  "+ res + " max_end : " +max_end + " arr[i] : " + arr[i]);		

			if(arr[i] < arr[n] && res >= max_end) {
				max_end = res+1;
			}
		}

		if(max < max_end) {
			max = max_end;
		}
		return max_end;
	}
	
	
	// Dynamic programming storing and non recursive
	//TODO we need to complete this
	public int iterativeLongestSequence() {
		
		return 0;
	}
	
	
}





/*
---------------------------- Longest Sequence -----------------------
12,4,13,5,7

12 -- > max 1
12, 4 -- > max 1 
4,7  -- > 2


3 way to solve problem : 
1. Using recursion  
2. n square complexity using dynamic programmic 
3. using nlog(n) approach

http://www.geeksforgeeks.org/longest-monotonically-increasing-subsequence-size-n-log-n/

http://www.geeksforgeeks.org/longest-increasing-subsequence/


*/