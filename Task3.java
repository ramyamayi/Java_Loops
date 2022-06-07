package Loops;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 12 to select a month");
		int num = sc.nextInt();
		boolean condition = true;
		while (condition) {
		switch (num) {
		case 1:
			System.out.println("The no of days in January month are 31 ");
			condition = false;
			break;
		case 2:
			System.out.println("The no of days in Feburay month are 28 or 29 ");
			condition = false;
			break;
		case 3:
			System.out.println("The no of days in March month are 31 ");
			break;
		case 4:
			System.out.println("The no of days in April month are 30");
			condition = false;
			break;
		case 5:
			System.out.println("The no of days in May month are 31 ");
			condition = false;
			break;
		case 6:
			System.out.println("The no of days in June month are 30 ");
			condition = false;
			break;
		case 7:
			System.out.println("The no of days in July month are 31 ");
			condition = false;
			break;
		case 8:
			System.out.println("The no of days in August month are 31 ");
			condition = false;
			break;
		case 9:
			System.out.println("The no of days in September month are 30 ");
			condition = false;
			break;
		case 10:
			System.out.println("The no of days in October month are 31 ");
			condition = false;
			break;
		case 11:
			System.out.println("The no of days in November month are 30 ");
			condition = false;
			break;
		case 12:
			System.out.println("The no of days in December month are 31 ");
			condition = false;
			break;
	
			default:
				System.out.println("Invalid details ");
				condition = false;
				break;
			
		
			
			
		}

	}
	}
}
