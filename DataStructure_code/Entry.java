package com.DS.sorting;

public class Entry {

	public static void main(String args[]) {
		
		int arr[] = {  12,4,13 ,5, 7 } ;//,6 ,7,76,24,55};
		//System.out.println("Searching :");
		//printArray(arr);
		//MergeSort sort = new MergeSort();
	///	sort.mergeSort(arr , 0 , arr.length-1);
	//	printArray(arr);
		
		//BinarySearch b = new BinarySearch();
		//System.out.println(b.linearSearch(arr, 13));
		
		
		//LongestSequence log = new LongestSequence();
		//System.out.println(log.sequence(arr, arr.length-1));
		
		
		//LongestCommonSequence lc = new LongestCommonSequence();
		String first = "sunday" , second = "saturday";
		//System.out.println(lc.dynamic(first, second, first.length(), second.length()));
		
		
		// MinDistanceEdit
		//MinDistanceEdit min = new MinDistanceEdit();
		//System.out.println(min.minEditString(first, second, first.length(), second.length()));
		
		
		// Minimum Cost
		/*MinimumCost minCos = new MinimumCost();
		int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
			System.out.println("minimum cost to reach (2,2) = " +
					minCos.iterativeMinCost(cost,2,2)); */
		
		// KnapSack Problem
	/*	KnapSackProblem kn = new KnapSackProblem();
		 int val[] = new int[]{60, 100, 120};
	        int wt[] = new int[]{10, 20, 30};
	    int  W = 50;
	    int n = val.length;
	    System.out.println(kn.knapSack(wt, val, W, n)); */
		
		// Egg Problem 
		// EggProblem egg = new EggProblem();
		//  System.out.println(egg.iterativeEgg(2, 10));
		
		// LongestPalindrom
		LongestPalindrom longpalin = new LongestPalindrom();
		System.out.println(longpalin.longestPalindrom("GEEKSFORGEEKS", 0, 13-1));
	}
	
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
}

