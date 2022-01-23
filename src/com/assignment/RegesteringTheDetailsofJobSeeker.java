package com.assignment;
import java.util.Scanner;
public class RegesteringTheDetailsofJobSeeker {

	public static void main(String[] args) {
		RegesteringTheDetailsofJobSeeker user = new RegesteringTheDetailsofJobSeeker();
		System.out.println("Enter the user name : ");
		String username= new Scanner(System.in).nextLine();
		boolean flag = user.validation(username);
		if(flag)
			System.out.println("Validation Successful");
		else
			System.out.println("Validation failed");

	}
	boolean validation(String username) {
		boolean flag=false;
		if(username.endsWith("_job")) {
			String[] spli=username.split("_job");
			int len=spli[0].length();
			if(len>=8)
				flag=true;
		}
		return flag;

	}

}
