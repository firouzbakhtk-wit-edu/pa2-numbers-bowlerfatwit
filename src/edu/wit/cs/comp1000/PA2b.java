package edu.wit.cs.comp1000;

import java.util.Scanner;
import java.text.DecimalFormat;

// Flynn Bowler
public class PA2b {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter a b c: ");
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double discriminant = (b*b) - (4 * a * c);
		
		if ( discriminant == 0) {
			
			System.out.println("Root: " + df.format((-b / (2*a) )));
			
			
		} else if (discriminant > 0) {
			
			if ((-b + Math.sqrt(discriminant)) / (2*a) > ((-b - Math.sqrt(discriminant)) / (2*a)))
				
				System.out.println("Roots: " + (df.format((-b - Math.sqrt(discriminant)) / (2*a) )) + ", " + df.format((-b + Math.sqrt(discriminant)) / (2*a) )); 
			
			else 
				
				System.out.println("Roots: " + (df.format((-b + Math.sqrt(discriminant)) / (2*a) )) + ", " + df.format((-b - Math.sqrt(discriminant)) / (2*a) ));
				
		} else if (discriminant < 0 ) {
			System.out.println("Roots: imaginary");
		}
		
		
		
		
	}

}
