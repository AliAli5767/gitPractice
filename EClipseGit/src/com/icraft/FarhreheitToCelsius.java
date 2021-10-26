package com.icraft;

import java.util.Scanner;

public class FarhreheitToCelsius {

		public static void main(String[] args) {

		    Scanner input = new Scanner(System.in);
			System.out.println("Enter the temperature in Celsius:");
			double Celsius = input.nextDouble();
			double Fahrenheit = (9.0 / 5) * Celsius + 32;
			System.out.printf(Celsius + "in Celsius is" + " " + Fahrenheit  + " " + "in Fahrenheit");
			

		}

	}