package com.DS.sorting;

public class ChangeProblem {

	public int count(int s[] , int m , int n) {
		if(n==0)
			return 1;
		if(n<0){
			return 0;
		}
		
		return count(s , m-1 , n) + count(s , m , n- s[m-1]);
	}
}
