import java.util.Scanner;

public class whileLoops {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.print("Enter any positive integer: ");

		int num;
		byte cont;

		num = console.nextInt();
		cont = 1;

		System.out.println("Multiplication Table of " + num);

		while (cont <= 10) {
			System.out.println(num + "x" + cont + "=" + num * cont);
			cont++;
		} // while

		console.close();
	}// main
}// class
