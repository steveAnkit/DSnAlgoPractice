package com.geeks.practice.selectionSort;

public class SelectionSort {

	
	/*
	 * Best thing about selection sort is that it never makes more than O(n) swaps
	 * so it can be useful where memory write is a costly operation.
	 * Time Complexity: O(n * n) 
	 */
	
	public static void main(String[] args) {
				int arr[] = {6,2,9,1,0,45};
				selection(arr);
				
				for(int i =0; i <arr.length;i++){
					System.out.print(" ");
					System.out.print(arr[i]);
				}
				
				
	}
	
	public static void selection(int arr[]){

		for(int i =0; i<arr.length ; i++){
			int min = i;
			for(int j = i; j<arr.length ; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	

}
