package com.assignment;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Ex3 {

	public static void main(String[] args) {
		
		Date date =new Date();
		SimpleDateFormat format = new SimpleDateFormat("E dd:MM:YYYY 'at' hh:mm:ss a zzz");
		System.out.println("Current Date ="+format.format(date));
	}

}
