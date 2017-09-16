package com.DS.sorting;

public class Factorial {

	static int cache[] = new int[5];
	public static int fact(int n) {
		if(n==1){
			return 1;
		}
		if(cache[n] != 0) {
			return cache[n];
		}
		else{
//			cache[n] = n* cache
		return n * fact(n-1);
		}
	}
	
	public static int iterativeFact(int n) {
		
		int res = 1;
		for(int i=n; i > 0; i--){
			res = res*i;
		}
		return res;
	}
	public static void main(String args[]) {
		System.out.println(iterativeFact(5));
	}
	
	
	
}
