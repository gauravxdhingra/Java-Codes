package Lect2_Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nst = 1;
		int row = 1;

		while (row <= n) {

			// work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}

			// prep
			row = row + 1;
			nst = nst + 1;
			System.out.println();

		}

	}
}






