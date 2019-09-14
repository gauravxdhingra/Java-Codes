package Lect2_Patterns;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;
		while (row <= n) {

			// work
			System.out.print("*");

			// prep
			row = row + 1;
			System.out.println();

		}

	}

}
