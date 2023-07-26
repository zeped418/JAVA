import java.util.Scanner;
public class exercise2 {

	public static void main(String[] args) {

		System.out.println("Enter client's age: ");
		
		Scanner input = new Scanner(System.in);
	
		int age = input.nextInt();
		double price=7.00;
		
		//age 60
		if (age >= 60) {
			price=price*0.45;
		}
		//age 5
		if (age <=5) {
			price=price*0.4;
		}
		
		System.out.println("Ticket price is: "+ price);
		input.close();
	}//main

}//priceCalculator