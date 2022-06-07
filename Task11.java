package Loops;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first floating point number");
		float first = sc.nextFloat();
		System.out.println("Enter second floating point number");
		float second = sc.nextFloat();
		
		
		if((Math.abs(first - second) <= 0.01)||(Math.abs(first - second) <= -0.01)) {
			System.out.println("They are the same up to two decimal places");
		}
		else {
			System.out.println("Not same");
		}
	}

}
