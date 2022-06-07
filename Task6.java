package Loops;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int first = sc.nextInt();
		
		System.out.println("Enter second number ");
		int second = sc.nextInt();
		
		System.out.println("Enter third number ");
		int third = sc.nextInt();
		
		if((first < second) && (second < third)) {
			System.out.println("INcreasing");
		}
		else if((first > second) && (second > third)) {
			System.out.println("Decreasing");
		}
		else {
			System.out.println("Neither increasing nor Decreasing");
		}


	}

}
