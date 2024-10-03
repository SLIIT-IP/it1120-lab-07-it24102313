import java.util.Scanner;
public class IT24102313Lab7Q3{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i = 1; i < 6; i++){
			
			System.out.println("Customer " + i );
			
			System.out.print("Enter total bill amount: ");
			int total = scanner.nextInt();
			
			double discount = total*0.05;
			double totalwithdiscount = total - discount;
			
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			char paymentmode = scanner.next().charAt(0);
			
			if((paymentmode == 'O') || (paymentmode == 'o')){
				
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: " + total);
				
			}else if((paymentmode == 'C') || (paymentmode == 'c')){
				
				System.out.println("Discount is : " + discount);
				System.out.println("Amount to be paid: " + totalwithdiscount);
				
			}else{
				System.out.println("Payment Mode is Not valid");
			}
			
			System.out.println("");
			
		}
		
		
	}
	
}