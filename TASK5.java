package Loops;

import java.util.Scanner;

public class TASK5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		Long num = sc.nextLong();
		long sum = 0L;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;

		}

		System.out.println(sum);
		while (num != 0) {
			num = num / 10;
			++count;
		}
		System.out.println(count);

	}

}
