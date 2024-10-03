import java.util.Scanner;
public class IT24102313Lab7Q1B{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int total = 0;
String grade = "";

for(int i = 1; i < 4; i++){
System.out.println("Student " + i);
System.out.print("Enter marks : ");


int mark1 = scanner.nextInt();
int mark2 = scanner.nextInt();
int mark3 = scanner.nextInt();
int mark4 = scanner.nextInt();

total = mark1 + mark2 + mark3 + mark4;

double avg = total/4.0;

System.out.println("Average is : " + avg);

if((avg <= 100) && (avg >= 75)){
	grade = "Distinction";
}else if((avg <= 74) && (avg >= 50)){
	grade = "Credit";
}else if((avg <= 49) && (avg >= 0)){
	grade = "Fail";
}else{
	System.out.println("Invalid Average");
}
	
	
System.out.println("Overall Grade is : " + grade);	
	System.out.println("");
	
}



}



}

