package com.bl.practiceProblems;
import java.util.Scanner;
public class LeapYear {
	
	int year=0;
	public static void main(String[] args) {
		System.out.println("Enter an Year");
		Scanner r=new Scanner(System.in);
		int year = r.nextInt();
		if(year%400==0)
		{
			System.out.println(year+ " Is a leap Year");
		}
		else if(year%4==0 && year%100 != 0)
		{
			System.out.println(year+ " Is a Leap Year");
		}
		else
		{
			System.out.println(year+ " Not a leap year");
		}
	}

}
