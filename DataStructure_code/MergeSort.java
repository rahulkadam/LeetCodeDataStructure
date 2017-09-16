package com.DS.sorting;

public class MergeSort {

	/*
	 * 2 , 5,3,4 , 17,15,14
	 * 
	 * 
	 */
	public void merge(int arr[] , int s , int l) {
		if(s<l) {
			System.out.println("Merge :  " + s + " : " + l + "  : Mid : " +(s+l)/2);
			printArray(arr);
			int mid = (s+l)/2;
			merge(arr , s , mid);
//			merge(arr , mid+1 , l);
			sort(arr , s , mid , l);
		}		
	}
	
	 void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	
	public void sort( int arr[] ,  int l , int m , int r) {
		
		System.out.println( " l :" +l +"  m : "+ m + " r : " + r);

		int n1 = m-l;
		int n2 = r-m;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		int i ,j;
		
		for(i=0; i <n1 ;++i) {
			left[i] = arr[l+i];
		}
		for(i=0; i <n2 ;++i) {
			right[i] = arr[m+1+i];
		}		
		
		 int k = l;
		 j = 0; i = 0;
	        while (i < n1 && j < n2)
	        {
	            if (left[i] <= right[j])
	            {
	                arr[k] = left[i];
	                i++;
	            }
	            else
	            {
	                arr[k] = right[j];
	                j++;
	            }
	            k++;
	        }
	 
	        /* Copy remaining elements of L[] if any */
	        while (i < n1)
	        {
	            arr[k] = left[i];
	            i++;
	            k++;
	        }
	 
	        /* Copy remaining elements of R[] if any */
	        while (j < n2)
	        {
	            arr[k] = right[j];
	            j++;
	            k++;
	        }
		
	        System.out.print(" In sort");
			printArray(arr);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void mergeSort(int arr[] ,  int l ,  int r) {
		if(l<r) {
			int m = (r+l)/2;
			System.out.println("l : " + l + " r : " + r);
			mergeSort(arr , l , m);
			mergeSort(arr , m+1 , r);
			mergeArray(arr, l, m, r);
		}
	}
	
	
	public void mergeArray(int arr[] , int l , int m , int r) {
		
		int n1 = m-l+1 , n2 = r-m;
	
		System.out.println("l : " + l + " r : " + r + " m : " + m);

		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i=0; i <n1 ; i++) {
			left[i] = arr[l+i];
		}
		
		for(int j=0; j<n2 ; j++) {
			right[j] = arr[m+j+1];
		}
		System.out.print("left : ");
		printArray(left);
		
		System.out.print("Right : ");
		printArray(right);

		int i=0, j=0 , k=l;
		while(i< n1 && j< n2) {
			if(left[i] < right[j]){
				arr[k] = left[i++];
			} else{
				arr[k] = right[j++];
			}
			k++;
		}
		
		while(i < n1) {
			arr[k++] = left[i++];
		}
		while(j < n2) {
			arr[k++] = right[j++];
		}
		System.out.print("  sort  : ");
		printArray(arr);
		
	}
	
}
