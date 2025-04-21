package Assessment;

import java.util.Scanner;

public class gameStore {

	Scanner sc = new Scanner(System.in);

	public void choose() {
		System.out.println("1.Call of Warfare - $1500");
		System.out.println("2.Speed Racers -$1200");
		System.out.println("3.Mystery Mansion -$1000");
		System.out.println("4.Pixel Adventure $800");
		System.out.println("5.Puzzle Mania -$500");
		System.out.println("6.exit");
	}

	public void operation( int num,int a ) {
		switch (num) {
		case 1: {
			int cost = (a * 1500);
			System.out.println("Total cost :"+cost);
			break;

		}
		case 2: {
			int cost = a * 1200;
			System.out.println("Total cost :"+cost);
			break;
		}
		case 3: {

			int cost = a * 1000;
			System.out.println("Total cost :"+cost);
			break;
		}
		case 4: {

			int cost = a * 800;
			System.out.println("Total cost :"+cost);
			break;

		}
		case 5: {
			int cost = a * 500;
			System.out.println("Total cost :"+cost);
			break;
		}

		case 6: {
			break;
		}

		default: {
			System.out.println("Continue shopping!! Enter the number");
			choose();
			int m = sc.nextInt();

		}

		}
	}
}
