package SLTDemos;
//Write the Program to accept from Runtime
import java.util.Scanner;

public class RunTimeAddition {

	private static Scanner scanner;

	public static void main(String[] args) {
	

		int num1,num2,result;

		scanner = new Scanner(System.in);

		System.out.println("Enter the First Value:");
		num1=scanner.nextInt();

		System.out.println("Enter the Second Value:");
		num2=scanner.nextInt();

		result=num1+num2;

		System.out.println("Addition Result:"+result);	
		}
	}



	
		