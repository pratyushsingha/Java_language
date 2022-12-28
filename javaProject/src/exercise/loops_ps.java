package exercise;
import java.util.Scanner;
public class loops_ps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//      int n = 4;
//      for (int i = n; i > 0; i--) {
//
//          for (int j = 0; j < i; j++) {
//              System.out.print("*");
//          }
//              System.out.print("\n");
//      }
//       Write a program to sum first n even numbers using a while loop.
//      int n =10;
//      for (int i = 1; i<=n; i++){
//          System.out.println(2*i);
//
//      }
//      Write a program to print the multiplication table of a given number n.
     int n;

      System.out.print("Enter The Number: ");
      int m = sc.nextInt();
      for (int i = 1; i <=10; i++){
          System.out.printf("%d * %d = %d\n", i,m,i*m);
      }
//      Write a program to print a multiplication table of 10 in reverse order.
//      int n;
//
//      System.out.print("Enter The Number: ");
//      int m = sc.nextInt();
//      for (int i = 10; i >=1; i--){
//          System.out.printf("%d * %d = %d\n", i,m,i*m);
//      }
//Write a program to find the factorial of a given number using for loops.
//      System.out.println("Enter ur number:");
//      int n = sc.nextInt();
//      long factorial =1;
//      for (int i = 1; i<=n; ++i){
//          factorial=factorial*i;
//      }
//      System.out.printf("Factorial of %d = %d", n, factorial);
//Write a program to find the factorial of a given number using while loops.
//      System.out.println("Enter Ur Number: ");
//      int n = sc.nextInt();
//      int i = 1;
//      long NewFactorial = 1;
//      while (i<=n){
//          NewFactorial = NewFactorial*i;
//          i++;
//      }
//      System.out.printf("The Factorial of %d using While Loop is = %d", n, NewFactorial);
//Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
//      int n =8;
//      int addition =0;
//      for (int i =1; i<=10; i++) {
//          addition += n*i;
//      }
//      System.out.print(addition);

	}

}
