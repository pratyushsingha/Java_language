// Write a Java program to find whether a year entered by the user is a leap year or not.


package exercise;
import java.util.Scanner;

public class Leap_year {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter The Year: ");
	        int year = sc.nextInt();
	        if (year % 4==0){
	            System.out.printf("%d is a Lear Year", year);
	        }
	        else if (year % 400 == 0) {
	            System.out.printf("%d is a Lear Year", year);
	        }
	        else {
	            System.out.printf("%d is a common year, not a leap year", year);
	        }
	    }
}
