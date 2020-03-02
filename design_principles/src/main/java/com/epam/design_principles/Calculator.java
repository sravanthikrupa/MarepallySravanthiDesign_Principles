package com.epam.design_principles;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mathoperations mp = new Mathoperations();
		System.out.println("Enter the numbers to perform operations");
		double num1 = sc.nextInt();
		double num2 = sc.nextInt();
		System.out.println("Select the operations need to be done from --> +,-,*,/");
		System.out.println("Enter 1 for Addition" + "\n" +"Enter 2 for Substraction" + "\n" + "Enter 3 for Multiplication" + "\n" + "Enter 4 for Division");
		int option = sc.nextInt();
		switch(option){
		case 1:
			System.out.println("Answer is : " + mp.add(num1, num2));
			break;
		case 2:
			System.out.println("Answer is : " + mp.substract(num1, num2));
			break;
		case 3:
			System.out.println("Answer is : " + mp.multiply(num1, num2));
			break;
		case 4:
			System.out.println("Answer is : " + mp.divide(num1, num2));
			break;
		default:
			System.out.println("Invalid option entered");
			
		}
	}


}
