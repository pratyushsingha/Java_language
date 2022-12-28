package exercise;
import java.util.Scanner;
public class ArrayPs {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
//	        Create an array of 5 floats and calculate their sum.
//	        float [] num = {20,30,40,50,60};
//	        float sum =0;
//	        for (float element : num){
//	            sum = sum+ element;
//	        }
//	        System.out.printf("The Sum of all Nums are: %.2f", sum);
//	        Write a program to find out whether a given integer is present in an array or not.
//	        int [] arr = {20,30,40,50,60};
//	        System.out.println("Enter The Number:");
//	        int num1 = sc.nextInt();
//	        boolean IsInArray= false;
//	        for (int element:arr){
//	            if (num1==element){
//	                IsInArray=true;
//	                break;
//	            }
//	        }
	//if (IsInArray){
//	    System.out.println("he value is present in the array");
	//}
	//else {
//	    System.out.println("he value is not present in the array");
	//}
	// Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
//	        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//	        float sum =0;
//	        for (float element : marks){
//	            sum = sum+ element;
//	        }
//	        System.out.printf("The Sum of all Nums are: %.2f", sum/ marks.length);
	//Write a Java program to reverse an array.
//	        float [] num = {20,30,40,50,60};
//	        for (int i = num.length-1; i>=0; i--){
//	            System.out.println(num[i]);
//	        }
	//Write a Java program to find the maximum element in an array.
	//int []arr = {2,3222,4,15,62};
//	        int max = Integer.MIN_VALUE;
//	        for (int element: arr){
//	            if (element>max){
//	                max = element;
//	            }
//	        }
//	        System.out.printf("The Value Of The Maximum Element in This Array is:%d\n",max);
	//Write a Java program to find the minimum element in an array.
//	        int []arr = {2,3222,4,15,62};
//	        int min = Integer.MAX_VALUE;
//	        for (int element1:arr){
//	            if (element1<min){
//	                min = element1;
//	            }
//	        }
//	        System.out.println(min);

	//Write a Java program to find whether an array is sorted or not.
	        boolean isSorted = true;
	        int [] arr = {1,20,3,4,5,6,7};
	        for(int i = 0; i < arr.length-1; i++){
	        if (arr[i]>arr[i+1]){
	            isSorted = false;
	            break;
	        }
	        }
	       if (isSorted){
	           System.out.println("The Array is Sorted");
	       }
	       else {
	           System.out.println("The array is not Sorted");
	       }


	    }
}
