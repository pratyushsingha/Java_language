//Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]



package exercise;
import java.util.Scanner;
public class week_days {
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter The No. of The day: ");
	       int day = sc.nextInt();
	        switch (day) {
	            case 1 -> System.out.println("Monday");
	            case 2 -> System.out.println("Tuesday");
	            case 3 -> System.out.println("Wednessday");
	            case 4 -> System.out.println("Thursday");
	            case 5 -> System.out.println("Friday");
	            case 6 -> System.out.println("Saturday");
	            case 7 -> System.out.println("Sunday");
	            default -> System.out.println("Error");




	    }
	}
}


