package com.DS.sorting;

public class MinimumCost {
	
	// http://www.geeksforgeeks.org/dynamic-programming-set-6-min-cost-path/

	public int minCost(int arr[][] , int m , int n) {
		if(m <0 || n <0) {
			return 0;
		}
		
		return arr[m][n] + min (minCost(arr, m-1, n-1) ,
				minCost(arr, m-1, n),
				minCost(arr, m, n-1));
	}
	
	
	public int iterativeMinCost(int arr[][] , int m,  int n) {
		int cache[][] = new int[m+1][n+1];
		cache[0][0] = arr[0][0];
		
		for(int i=1 ; i <=m ; i++ ) {
			cache[i][0] = cache[i-1][0] + arr[i][0];
		}
		
		for(int j=1 ; j<=n ; j++) {
			cache[0][j] = cache[0][j-1] + arr[0][j];
		}
		
		for(int i=1 ; i<= m ; i++) {
			for(int j=1; j <= n; j++) {
				cache[i][j] = min( arr[i-1][j-1] , arr[i][j-1] , arr[i-1][j]) + arr[i][j];
			}
		}
		return cache[m][n];
	}

	public int min(int x , int y , int z) {
		if(x < y && x <z) 
			return x;
		else if( y < x && y < z) 
			return y;
		return z;
	}
}
