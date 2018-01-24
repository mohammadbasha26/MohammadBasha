package SLTDemos;
//: Write a Program to check the biggest number between three given integers using if Ladder.
import java.util.Scanner;

public class BigNumberInThree {


	public static void main(String arg[])
	{
	int num1,num2,num3;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the First Value:");
	num1=scanner.nextInt();
	System.out.println("Enter the Second Value:");
	num2=scanner.nextInt();
	System.out.println("Enter the Third Value:");
	num3=scanner.nextInt();
	if(num1>num2 && num1>num3)
		System.out.println("Number 1 is Biggest"+num1);
	else if(num2>num3)
		System.out.println("Number 2 is Biggest"+num2);
	else
		System.out.println("Number 3 is Biggest"+num3);
	}
}

