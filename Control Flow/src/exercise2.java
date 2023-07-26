import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {

		System.out.println("Enter client's age: ");

		Scanner input = new Scanner(System.in);

		int age = input.nextInt();
		double price = 7.00;

		
		if (age >= 60) {
			price = price * 0.45;
			System.out.println("Price per ticket: " + price);
		}// if age 60
		
		if (age <= 5) {
			price = price * 0.4;
			System.out.println("Price per ticket: " + price);
		}// if age 5

		if (age > 6 && age < 60) {
			System.out.println("Number of tickets: ");
			Scanner input2 = new Scanner(System.in);
			int tickets = input2.nextInt();

			if (tickets > 1) {
				price = price * tickets * .7;
				System.out.println("Price per ticket: " + price + ". ("+ tickets + " tickets).");
			} else {
				price = price * tickets;
				System.out.println("Price per ticket: " + price);

			} // if tickets 2+
			input2.close();
		} // if buyer normal

		System.out.println("Thanks for coming!");
		input.close();

	}// main

}// priceCalculator