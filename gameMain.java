package Assessment;

import java.util.Scanner;

public class gameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		gameStore gs = new gameStore();
		gs.choose();
		System.out.println("Choose a game by entering the number next to it : ");
		int choice = sc.nextInt();

		System.out.println("How many copies of the game would you like?");
		int copies = sc.nextInt();
		System.out.println(copies + " Games added to your cart .");

		gs.operation(choice, copies);

	}
}
