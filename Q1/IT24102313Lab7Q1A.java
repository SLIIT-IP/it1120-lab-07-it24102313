import java.util.Scanner;
public class IT24102313Lab7Q1A
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
	  
	  int total = 0;
	  int marks;
	  System.out.println("Enter marks for four subjects:");
	  
	  for(int i = 1; i < 5; i++){
	  System.out.print("Enter Subject Mark " + i + ": ");
	   marks = scanner.nextInt();
	  
	 total += marks;
	  
	  }
   
        double avg = total/4.0;
		System.out.println("");
		System.out.println("Average is :" + avg);
		
		String grade = "";
		
		if((avg <= 100) && (avg >= 75)){
		grade = "Distinction";
		}
		else if((avg <= 74) && (avg >= 50)){
		grade = "Credit";
		}
		else if((avg <= 49) && (avg >= 0)){
		grade = "Fail";
		}
		else{
		System.out.println("Invalid Average");
		}
		
		System.out.println("Overall Grade is : " + grade);
		
		
   }

}