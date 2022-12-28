package exercise;
//write a program to convert kilometers to miles


import java.util.Scanner;
public class KiloToMiles {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Convert km to miles");
	        System.out.println("kilometers: ");
	        float km = sc.nextFloat();
	        float miles = km*0.6213712F;
	        System.out.format("%.3f kilometer = %.4f miles", km,miles);
	     


	    }

}
