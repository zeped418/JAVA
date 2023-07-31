import java.util.Scanner;

public class part1 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String name;

		System.out.println("Enter your name:  ");
		name = console.nextLine();
		
		printNameLength("name length: " + name);
		System.out.println("Name Chatacters below: ");
		printNameCharacters(name);
		console.close();
	}//main

	private static void printNameLength(String name) {
		System.out.println(name.length());
	}//Length

	private static void printNameCharacters(String name) {
		for (int pos = 0; pos < name.length(); pos++) {
			System.out.println(name.charAt(pos));
		}//for 
	}//Characters

}//Part1
