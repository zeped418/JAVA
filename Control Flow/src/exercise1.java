import java.util.Scanner;
public class exercise1 {

	public static void main(String[] args) {

		System.out.println("Enter sales value: ");
		
		Scanner input = new Scanner(System.in);
	
		double sales = input.nextDouble();
		double comission;
				
		if (sales >= 10000) {
			comission=sales*0.3;
		} else if (sales >= 5000|| sales <=9999) {
			comission=sales*0.2;
		} else if (sales >= 1001|| sales <=4999) {
			comission=sales*0.1;
		}else{
			comission=0;
		}
		
		System.out.println("Your comission is: "+ comission);
		input.close();
	}//main

}//comissionCalculator