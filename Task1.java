package Loops;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i =0; i <= 20;i++) {
			int result = num*i ;
			System.out.println(num +" * " + i +" = "+ result );
		}

	}

}
