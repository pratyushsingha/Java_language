package exercise;
import java.util.Scanner;
class web_url {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ur URL: ");
        String Website = sc.next();
        if (Website.endsWith(".com")){
            System.out.println("This Is A Commercial Website");
        }
        else if (Website.endsWith(".org")){
            System.out.println("This Is A Organization Website");
        }
        else if (Website.endsWith(".in")){
            System.out.println("This Is A Indian Website");
        }
    }
	

}
