import java.util.Scanner;

public class DemoLetters {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.print("Enter any name: ");
		
		String txt = console.next();
		int largo= txt.length();
		byte cont=0;


		while (cont < largo) {
			System.out.println(txt.charAt(cont));
			cont++;
		} // while

		console.close();
	}// main
}// class
