package exercise;
//Write a program which asks the user to enter his or her name and greets them with Hello <name> ,good morning text.......
import java.util.Scanner;

class HelloName {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Bro...What's Ur Name");
	        String str = sc.nextLine();
	        System.out.print("Hello...Good Morning Dear ");
	        System.out.println(str);

	    }
}
