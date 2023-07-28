import java.util.Scanner;

public class DemoDoWhile {
	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		int num, var1, var2, cont, sum;
		
		System.out.print("Enter any positive integer: ");
		//if ((console.hasNextInt()) && console.nextInt()>=0) {
			
			num = console.nextInt();
			var1=0;
			var2=1;
			cont=1;

			do {
				
				if(num==0){
					System.out.println(0);
					break;
				}//num ==0
				
				if(num==1){
					System.out.println(0);
					System.out.println(1);
					break;
				}//num==1
				
				if(num>0 && cont==1){
					System.out.println(0);
					System.out.println(1);
				}//num>0 and cont ==1
				
				sum = var1+var2;
				var1=var2;
				var2=sum;
				System.out.println(sum);
				cont++;
			}while(cont<num);//while
		//}else{
			//System.out.println("Your number is incorrect, bye");
		//}//if input is integer
		console.close();
	}// main
}// class
