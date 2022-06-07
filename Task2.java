package Loops;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int avg = 0;
		for (int i = 0; i <10; i++) {
			System.out.println("Enter a number " + (i+1));
			int num = sc.nextInt();
			sum = sum + num;
			avg = sum / 10;
		}
		System.out.println("Sum is : " + sum);
		System.out.println("Avg is : " + avg);
	}

}
