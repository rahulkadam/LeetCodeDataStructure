package com.DS.sorting;

public class KnapSackProblem {

	public int knapSack(int w[] , int v[] , int weight , int n) {
		
		System.out.println("Knapsack weight : " + weight);
		if(n==0 || weight==0)
			return 0;
		if(w[n-1] > weight) {
			return knapSack(w, v, weight, n-1);
		} else{
			return max( v[n-1] +knapSack(w, v, weight-w[n-1], n-1) ,
					knapSack(w, v, weight, n-1));
		}
		
	}
	
	public int max(int a , int b) {
		if(a<b){
			return b;
		}
		return a;
	}
	
	
	public int iterativeKnapSack(int w[] , int v[] , int weight , int n) {
		int cache[][] = new int[n+1][weight+1];
		
		
		for(int i=0; i <=n; i++) {
			for(int j=0 ; j<=weight ; j++) {
				if(i==0 || j==0){
					cache[i][j] =0;
				} else if(w[i-1] <=j) {
				cache[i][j] = max(v[i-1] + cache[i-1][j-w[i-1]] ,
						       cache[i-1][j]);
				} else{
					cache[i][j] = cache[i-1][j];
				}
			}
		}
		
		return cache[n][weight];
	}
}
