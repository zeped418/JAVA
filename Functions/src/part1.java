import java.util.Scanner;

public class part1 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String name, lastName;

		System.out.println("Enter your name:  ");
		name = console.nextLine();
		
		 System.out.println("Enter your last name: ");
	     lastName = console.nextLine();
	     
	    System.out.println("Name length: ");
		printNameLength(name);
		
		System.out.println("Name Chatacters below: ");		
		printNameCharacters(name);
        
		printFullName(name, lastName);
		
		console.close();
	}// main

	private static void printNameLength(String name) {
		System.out.println(name.length());
	}// Length

	private static void printNameCharacters(String name) {
		for (int pos = 0; pos < name.length(); pos++) {
			System.out.println(name.charAt(pos));
		} // for
	}// Characters

	private static void printFullName(String name, String lastName) {
		System.out.println("Full name: " + name + " " + lastName);
	}
}// Part1
