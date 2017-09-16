package com.DS.sorting;

public class BinarySearch {
	
	
	// Binary Search  recursion example complexity log(n)
	public int search(int arr[] , int n , int l , int r) {
		if( l < r) {
			if(arr[(l+r)/2] == n)
			{
				return n;
			}
			if(arr[(l+r)/2] > n) {
				return search(arr , n,l , (l+r)/2);
			} else {
				return search(arr , n, (l+r)/2+1 ,r);
			}
		}
		return 0;
	}
	
	public int iterativeSearch(int arr[] , int n) {
        int i=0 , j = arr.length-1 , k=0;
        while(i<=j) {
        	k = (i+j)/2;
        	System.out.println(" arr : " + arr[k] + "  n : " + n+" i : " + i + " j : " + j  + " k " + k);
        	if(arr[k] == n) {
        		return n;
        	}
        	if(arr[k] < n){
        		System.out.println(" aarr > n");
        		i = k+1;
        	}else{
        		System.out.println(" aarr < n");
        		j = k-1;
        	}
        }
		return 0;
	}
	
	public int linearSearch(int arr[] , int n) {
		
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] ==n) {
				return 1;
			}
		}
		
		return 0;
	}
}
