package com.geeks.practice.MatrixProblems;

public class PrintMatrixInSpiral {

	
	public static void spiralPrint(int eR, int eC , int a[][])
	{
		int sR = 0;
		int sC=0;
		
        while (sR < eR && sC < eC)
        {
        	
        	//print first row from the remaining rows
        	for(int i = sC ; i< eC ; i++)
        	{
        		System.out.print(a[sR][i] + " ");
        	}
        	sR++;
        
        	
        	//print last column from the remaining columns
        	for(int i=sR; i< eR ; i++)
        	{
        		System.out.print(a[i][eC-1] + " ");
        	}
        	
        	eC--;
        	
        	 // Print the last row from the remaining rows 
        	if(sR < eR)
        	{
        		for(int i = eC-1 ; i >= sC ; i--) 
        		{
        			System.out.print(a[eR-1][i]+ " ");
        		}
        		
        		eR--;
        	}
        	
        	//print the first column from the remaining colummns
        	if(sC < eC)
        	{
        		for(int i = eR-1; i >=sR ; i--)
        		{
        			System.out.print(a[i][sC]+" ");
        		}
        		sC++;
        	} 
        
        	
        	
        }
		
		
		
	}
	
	public static void main(String[] args) {
		
		    int R = 3;
	        int C = 6;
	        int a[][] = { {1,  2,  3,  4,  5,  6},
	                      {7,  8,  9,  10, 11, 12},
	                      {13, 14, 15, 16, 17, 18}
	                    };
	        
	        spiralPrint(R,C,a);
		    

	}

}
