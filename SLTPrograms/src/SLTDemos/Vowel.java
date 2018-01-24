package SLTDemos;
//Write a Program to check whether a given character is vowel or consonant.
import java.util.Scanner;

public class Vowel {
	
		private static Scanner scanner;

		public static void main(String arg[])
		{
		char ch;
		scanner = new Scanner(System.in);
		System.out.println("Enter a Character");
		ch=scanner.next().charAt(0);
		switch(ch)
		{
			case 'A':
			case 'a':
				System.out.println("Vowel");
			break;
			case 'E':
			case 'e':
				System.out.println("Vowel");
			break;
			case 'I':
			case 'i':
				System.out.println("Vowel");
			break;
			case 'O':
			case 'o':
				System.out.println("Vowel");
			break;
			case 'U':
			case 'u':
				System.out.println("Vowel");
			break;
			default:
				System.out.println("Consonant");
		}

		}
	}

