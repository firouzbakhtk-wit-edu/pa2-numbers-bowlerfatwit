package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter five whole numbers:");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
		double num4 = scanner.nextDouble();
		double num5 = scanner.nextDouble();
		
		double sum = 0;
		double posSum = 0;
		double negSum = 0;
		double avg = 0;
		double posAvg = 0;
		double negAvg = 0;
		
		sum = num1 + num2 + num3 + num4 +num5;
		
		if (num1 > 0)
			sum += num1;
		else negSum += num1;
	}

}
