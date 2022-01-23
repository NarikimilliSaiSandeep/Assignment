package com.assignment;
import java.util.Scanner;
public class SumOfCubesOfnDigitNumber {

	public static void main(String[] args) {
		Scanner Scan =new Scanner(System.in);
		 System.out.println("Input :");
		 int num =Scan.nextInt();
		 int sum =0;
		 while(num>0) {
			 int mod =num%10;
			 sum = sum +(int)Math.pow(mod,  3);
			 num = num/10;
		 }
		 System.out.println("Output: Sum of The Digit The Of The Cube =" +sum);

	}

}
