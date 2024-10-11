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
			
			System.out.print("Root: " + (-b / (2*a) ));
			
			
		} else if (discriminant > 0) {
			
			if ((-b + Math.sqrt(discriminant)) / (2*a) > ((-b - Math.sqrt(discriminant)) / (2*a)))
				
				System.out.print("Root: " + (((-b - Math.sqrt(discriminant)) / (2*a) )) + " , " + ((-b + Math.sqrt(discriminant)) / (2*a) )); 
			
			else 
				
				System.out.print("Root: " + (((-b + Math.sqrt(discriminant)) / (2*a) )) + ((-b - Math.sqrt(discriminant)) / (2*a) ));
				
		} else if (discriminant < 0 ) {
			System.out.print("Roots: imaginary");
		}
		
		
		
		
	}

}
