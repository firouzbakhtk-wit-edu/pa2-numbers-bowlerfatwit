package edu.wit.cs.comp1000;

import java.util.Scanner;

//Flynn Bowler
public class PA2a {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter five whole numbers:");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		
		int sum = 0;
		int posSum = 0;
		int negSum = 0;
		double avg =0;
		double posAvg =0;
		double negAvg =0;
		double numOfPos = 0;
		double numOfNeg = 0;
		
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
		negAvg = negSum / (1.0 * numOfNeg);
		
		System.out.println("The sum of the " + numOfPos + " positive numbers: " + posSum);
		System.out.println("The sum of the " + numOfNeg + " non-positive numbers: "+ negSum);
		System.out.println("The sum of the 5 numbers: "+ sum);
		System.out.println("The average of the " + numOfPos + " positive numbers: " + posAvg);
		System.out.println("The average of the  " + numOfNeg + " non-positive numbers: " + negAvg);
		System.out.println("The average of the 5 numbers: " + avg);
	}
	
	

}
