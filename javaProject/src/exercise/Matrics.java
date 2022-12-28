

package exercise;
import java.util.Scanner;

public class Matrics {
	 public static void main(String[] args) {
	        int m1[][],m2[][],m3[][];
	        m1 = new int[3][3];
	        m2 = new int[3][3];
	        m3 = new int[3][3];
	        Scanner sc = new Scanner(System.in);
//	        User Input for First Matrix
	        System.out.println("Enter Ur First Matrix");
	        for (int i = 0; i <m1.length;i++) {
	            for (int j = 0; j < m1[i].length; j++){
	                m1[i][j] = sc.nextInt();
	            }

	        }
	        //        User Input for Second Matrix
	        System.out.println("Enter Ur Second Matrix");
	        for (int i = 0; i <m2.length;i++) {
	            for (int j = 0; j < m2[i].length; j++) {
	                m2[i][j] = sc.nextInt();
	            }
	        }
//	        Result
	        System.out.println("Addition................");
	        for (int i = 0; i <m3.length;i++) {
	            for (int j = 0; j < m3[i].length; j++){
	                m3[i][j] = m1[i][j]+m2[i][j];
	                System.out.print(m3[i][j]+"\t");

	            }
	            System.out.println("");
	        }



	    }

}
