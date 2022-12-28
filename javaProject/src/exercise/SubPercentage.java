package exercise;
import java.util.Scanner;
public class SubPercentage {
	   public static void main(String[] args) {
	        System.out.println("Enter Ur Following Marks:---- ");
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Your Total Marks : ");
	        float total_marks = sc.nextFloat();
	       
	        System.out.print("enter ur marks: ");
	        float sub1 = sc.nextFloat();
	        System.out.print("enter ur marks: ");
	        float sub2 = sc.nextFloat();
	        System.out.print("enter ur marks: ");
	        float sub3 = sc.nextFloat();
	        System.out.print("enter ur marks: ");
	        float sub4 = sc.nextFloat();
	        System.out.print("enter ur marks: ");
	        float sub5 = sc.nextFloat();
	        float total = sub1 + sub2 + sub3 + sub4 + sub5;
	        float percent = (total / total_marks) * 100;
	        System.out.print("Your Total Percentage: ");
	        System.out.println(percent);


	    }
}
