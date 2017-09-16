package com.DS.sorting;

public class MinDistanceEdit {

	
	public int minEditString(String first, String second , int l1 , int l2) {
		
		if(l1 == 0) {
			return l2;
		}
		if(l2 ==0)
		 return l1;
		
		if(first.charAt(l1-1) == second.charAt(l2-1)) {
			return minEditString(first, second, l1-1, l2-1);
		}
		else{
			return 1+ min(minEditString(first, second, l1-1, l2) ,
					minEditString(first, second, l1, l2-1),minEditString(first, second, l1-1, l2-1));
		}
	}
	
	public int min(int x , int y , int z) {
		if(x < y && x <z) 
			return x;
		else if( y < x && y < z) 
			return y;
		return z;
	}
}
