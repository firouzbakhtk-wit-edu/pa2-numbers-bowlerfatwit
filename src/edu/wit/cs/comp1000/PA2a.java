package edu.wit.cs.comp1000;

import java.text.DecimalFormat;
import java.util.Scanner;

//Flynn Bowler
public class PA2a {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter five whole numbers: ");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		
		int sum = 0;
		int posSum = 0;
		int negSum = 0;
		double avg = 0;
		double posAvg = 0;
		double negAvg = 0;
		int numOfPos = 0;
		int numOfNeg = 0;
		
		sum = num1 + num2 + num3 + num4 +num5;
		avg = sum / 5.0;
		
		if (num1 > 0) {
			posSum += num1;
			numOfPos++; }
		else { negSum += num1;
		numOfNeg++;}
		
		if (num2 > 0) {
			posSum += num2;
			numOfPos++;
		}
		else { negSum += num2;
		numOfNeg++;} 
		
		if (num3 > 0) {
			posSum += num3;
			numOfPos++; }
		else { negSum += num3;
		numOfNeg++;}
		
		if (num4 > 0) {
			posSum += num4;
			numOfPos++; }
		else { negSum += num4;
		numOfNeg++;}
		
		if (num5 > 0) {
			posSum += num5;
			numOfPos++; }
		else {negSum += num5;
		numOfNeg++;}
		
		posAvg = posSum / (1.0 * numOfPos);
		if (numOfPos == 0)
			posAvg = 0.0;
		negAvg = negSum / (1.0 * numOfNeg);
		if (numOfNeg == 0)
			negAvg = 0.0;
		
		if (numOfPos == 0 || numOfPos > 1) {
			System.out.println("The sum of the " + numOfPos + " positive numbers: " + posSum);
		} else
			System.out.println("The sum of the " + numOfPos + " positive number: " + posSum);
		
		if (numOfNeg == 0 || numOfNeg > 1) {
			System.out.println("The sum of the " + numOfNeg + " non-positive numbers: "+ negSum);
		} else 
			System.out.println("The sum of the " + numOfNeg + " non-positive number: "+ negSum);
		
		System.out.println("The sum of the 5 numbers: "+ sum);
		
		if (numOfPos == 0 || numOfPos > 1) {
			System.out.println("The average of the " + numOfPos + " positive numbers: " + df.format(posAvg));
		} else
			System.out.println("The average of the " + numOfPos + " positive number: " + df.format(posAvg));
		
		if (numOfNeg == 0 || numOfNeg > 1) {
			System.out.println("The average of the " + numOfNeg + " non-positive numbers: " + df.format(negAvg));
		} else 
			System.out.println("The average of the " + numOfNeg + " non-positive number: " + df.format(negAvg));
		
		System.out.println("The average of the 5 numbers: " + df.format(avg));
	}
	
	

}
