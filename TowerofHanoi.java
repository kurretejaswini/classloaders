package world;

import java.util.Scanner;

public class TowerofHanoi {

	public void TOH(int n, String start, String aux, String end) {

		if (n == 1) {
			System.out.println(start + " -> " + end);
		} else {
			TOH(n - 1, start, end, aux);
			System.out.println(start + " -> " + end);
			TOH(n - 1, aux, start, end);
		}
	}

	public static void main(String[] args) {

		TowerofHanoi towersOfHanoi = new TowerofHanoi();

		System.out.print("Enter number of discs: ");
		Scanner sc = new Scanner(System.in);
		int discs = sc.nextInt();
		towersOfHanoi.TOH(discs, "A", "B", "C");

	}

}
