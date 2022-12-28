package exercise;
//write a java program to detect whether a number entered by the user is integer or not....


import java.util.Scanner;
public class IntVerify {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Ur Number: ");
	        boolean b1 = sc.hasNextInt();
	        System.out.println(b1);
	    }
}
