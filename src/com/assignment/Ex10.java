package com.assignment;
import java.util.Scanner;
public class Ex10 {
	
	public static int difference(int n){
		int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;

		  		  int sumN = (n * (n + 1)) / 2;

		  			  int squareSumN = sumN * sumN;
		  
		  
		  return Math.abs(sumSquareN - squareSumN);
}
}