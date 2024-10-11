package edu.wit.cs.comp1000;

import java.util.Scanner;

// Flynn Bowler
public class PA2b {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a b c: ");
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double discriminant = (b*b) - (4 * a * c);
		
		if ( discriminant == 0) {
			
		} else if (discriminant > 0) {
			
		} else if (discriminant < 0 ) {
			System.out.print("Roots: imaginary");
		}
		
		
		
		
	}

}
