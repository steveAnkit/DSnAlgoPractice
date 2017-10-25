package com.geeks.practice.aToPowerB;

import java.util.Scanner;

public class AToPowerB {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(printPower(num1, num2, 1));
		
	}
	

		
	public static int printPower(int a, int b, int count){

		if(count == b){
			return a;
			}
		else{
			++count;
			int sum = a *  printPower(a, b, count);
			return sum;
		}
	}

}
