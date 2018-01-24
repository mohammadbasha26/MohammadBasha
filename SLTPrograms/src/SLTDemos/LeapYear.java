package SLTDemos;
//Write a Program to check whether the year is a leap year or not using nested if.
import java.util.Scanner;

public class LeapYear {
	private static Scanner scanner;

	public static void main(String arg[])
		{
		int year;
		scanner = new Scanner(System.in);
		System.out.println("Enter the Year");
		year=scanner.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
				System.out.println("Leap Year");
			else
				System.out.println("Not a Leap year");
		}
		else
		{
			if(year%4==0)
				System.out.println("Leap Year");
			else
				System.out.println("Not a Leap year");
		}

		}
	}

