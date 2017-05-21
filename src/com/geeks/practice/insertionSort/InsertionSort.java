package com.geeks.practice.insertionSort;

public class InsertionSort {

	
	/*
	 * Time Complexity: O(n*n)
	 * Insertion sort takes maximum time to sort if elements are sorted in reverse order. 
	 * And it takes minimum time (Order of n) when elements are already sorted.
	*/
	
	public static void main(String[] args) {
		int arr[] = {6,2,9,1,0,45};
		insertion(arr);
		
		for(int i =0; i <arr.length;i++){
			System.out.print(" ");
			System.out.print(arr[i]);
		}
	}
	
	
	public static void insertion(int arr[]){
		for(int i =2; i < arr.length ; i++){
			
			int j = i -1;
			
			while(j >= 1){
				
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j -1 ];
					arr[j -1 ] = temp;
				}
				
				j--;
			}
			
			
		}
	}
	
	
	

}
