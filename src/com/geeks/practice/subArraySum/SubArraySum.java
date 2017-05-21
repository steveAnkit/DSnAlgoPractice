package com.geeks.practice.subArraySum;

public class SubArraySum {

	public static void main(String[] args) {
      int[] array = {2,3,5,1,};
      int sum = 6;
      int size = array.length;
      getSubArray(array, sum, size);
      
	}
	
	//Main function
	public static void getSubArray(int[] array , int sum, int n){
		
		int currentSum = array[0];
		int start = 0;
		for (int i = 1; i <= array.length; i++) {
			
			 while(currentSum > sum){
				 currentSum = currentSum - array[start];
				 start++;
			 }
			
			if(currentSum == sum){
				System.out.println("MATCH FOUND BETWEEN  "+ start +" AND "+ (i - 1) );
				break;
			}
            
			if(i < n)
			currentSum = currentSum + array[i]; 
			
		}
		
	}

}
