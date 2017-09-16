package com.DS.sorting;

public class EggProblem {

	
	public int FindEgg(int n , int k) {
		if(k==1 || k==0)
			return k;
		if(n==1) {
			return k;
		}
		
		int min = 99999 , i, res;
		
		for(i=1; i <= k ; i++) {
			res = max(FindEgg(n-1, i-1) , FindEgg(n, k-i));
			if(res < min) {
				min = res;
			}
			
		}
		return min+1;
	}
	
	public int iterativeEgg(int n , int k) {
		int eggDoors[][] = new int[n+1][k+1];
		int res ,i,j,x;
		
		for(i=0;i<=n ; i++) {
			eggDoors[i][0] = 0;
			eggDoors[i][1] = 1;
		}
		
		for(j =1 ; j<=k ; j++){
			eggDoors[1][j] = j;
		}
		
		for(i=2 ; i <=n ; i++) {
			for( j =2 ; j<=k ; j++) {
				eggDoors[i][j] = 9999;
				for(x = 1 ; x <=j ; x++) {
					res = 1+ max(eggDoors[i-1][x-1] , eggDoors[i][j-x]);
					if(res < eggDoors[i][j]){
						eggDoors[i][j] = res;
					}
				}
			}
		}
		
		return eggDoors[n][k];
	}
	public int max(int a , int b) {
		if(a<b){
			return b;
		}
		return a;
	}
}
