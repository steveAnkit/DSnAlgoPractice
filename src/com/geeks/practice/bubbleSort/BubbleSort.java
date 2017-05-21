package com.geeks.practice.bubbleSort;

public class BubbleSort {

	/*
	 * Time Complexity: O(n^2)
	 */
	
	public static void main(String[] args) {

		int arr[] = {1,4,2,9,7};
		bubble(arr);
		for(int i =0; i <arr.length;i++){
			System.out.print(" ");
			System.out.print(arr[i]);
		}
		
		
	}
	
	
	public static void bubble(int arr[]){
		
		for(int i=0; i<arr.length ;i++ ){
			for(int j=0; j<arr.length-1; j++){
				if(arr[j]  > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
	}

}
