
//import scanner y math
import java.util.Scanner;
import java.lang.Math;

public class Part2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Integer a;
		Integer b;
		
		System.out.println("Enter a:  ");
		a = console.nextInt();
		
		System.out.println("Enter b:  ");
		b = console.nextInt();
		
		System.out.println("Suma");
		printSuma(a, b);
		
		System.out.println("Resta");
		printRes(a, b);
		
		System.out.println("Multiplicación");
		printMult(a, b);
		
		System.out.println("División");
		printDiv(a, b);
		

		console.close();
	}//main

	private static void printSuma(int a, int b) {
		System.out.println(a + b);
	}//sum

	private static void printMult(int a, int b) {
		System.out.println(a * b);
	}//mult

	private static void printDiv(float a, float b) {
		System.out.println(a / b);
	}//div

	private static void printRes(int a, int b) {
		System.out.println(a - b);
	}//res
	
}//Part2
