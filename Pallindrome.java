package Assessment;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check for palindrome");
		int num = sc.nextInt();
		int rev = 0;

		while (num > 0) {
			int lastdigit = num % 10;
			rev = rev * 10 + lastdigit;
			num = num / 10;
			System.out.print(num);
		}

		if (num == rev) {
			System.out.println("\nPalindrome");
		} else {
			System.out.println("\nNot a Palidrome");

		}
	}
}
