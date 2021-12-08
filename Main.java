package com.company;

import java.awt.*;
import java.io.PrintStream;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;



public class Main {
	private static boolean exit;


	public static void main(String[] args) {
		int choice;
		Menu menu = new Menu();
		printHeader();
		runMenu();
	}

	public static void runMenu() {        //Metod för att köra menyn
		while (!exit) {
			printMenu();
			int choice = getInput();
			selectMenu(choice);

		}
	}


	public static void printHeader() {        //Metod som skriver ut printHeader
		System.out.println("Welcome!");
	}

	public static void printMenu() {
		System.out.println("What do you want to do?");
		System.out.println(" 1.Add two numbers");
		System.out.println(" 2.Count letters in a string");
		System.out.println(" 3.Revert a string");
		System.out.println(" 4.Summarize all numbers in a string");
		System.out.println(" 0.End");

	}

	private static int getInput() {                       //Får input för menyval
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		while (choice < 0 || choice > 4) {
			try {
				System.out.println("Select one from the menu");          //Säger till att man ska välja ett från menyn
				choice = Integer.parseInt(sc.nextLine());
			}
			catch (NumberFormatException e) {
				System.out.println("Wrong choice! Please select another");     //säger till när man har valt som inte finns i menyn
			}
		}
			return choice;
	}

	private static void selectMenu(int choice) {
		switch (choice) {
			case 0:
				exit = true;
				System.out.println("Bye!");
				break;
			case 1:
				addTwonumbers();
				break;
			case 2:
				countLetters();
				break;
			case 3:
				reverseString();
				break;

		}

	}

	private static void addTwonumbers() {                        //Metod som summerar två tal
	    Scanner input = new Scanner(System.in);
		System.out.println("Here we add two numbers");
		System.out.println("Write the first number");
		int firstNumber = input.nextInt();
		System.out.println("Enter your second number");
		int secondNumber = input.nextInt();
		System.out.println("The addition is = " + (firstNumber + secondNumber));
	}

	private static void countLetters() {                       //Metod som räknar ut antal bokstav i en  string
		System.out.println("Count letters in a string");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word you want to search for");
		String ord = sc.nextLine();
		System.out.print("Enter the letter you want to look for:");
		char c = (char) sc.nextLine().charAt(0);

		int nummer = 0;
		for (int i = 0; i < ord.length(); i++) {
			char ch = ord.charAt(i);
			if (ch == c) {
				nummer++;
			}
		}
		System.out.println("There is " + nummer + " in the word");
	}

	private static void reverseString() {         //Metod som spegelvänder ord
		System.out.println("Reverse string");
		System.out.println("Enter the word");
		Scanner input2 = new Scanner(System.in);
		String sc = input2.nextLine();
		String reverse = "";

		for (int i = sc.length() - 1; i >= 0; i--)
			reverse = reverse + sc.charAt(i);
		{
			System.out.println("Your reversed word is: " + reverse);
		}
	}
}





























































































