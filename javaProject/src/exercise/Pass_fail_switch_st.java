package exercise;
import java.util.Scanner;

class Pass_fail_switch_st {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ur Physics Marks: ");
        m1= sc.nextByte();
        System.out.println("Enter Ur Chemistry Marks: ");
        m2= sc.nextByte();
        System.out.println("Enter Ur Math Marks: ");
        m3= sc.nextByte();
        float avg = (m1+m2+m3)/0.3F;
        if (avg>=40 && m1 >=33 && m2 >=33 && m3>=33){
            System.out.println("U are passed!!!!");
        }
        else {
            System.out.println("Better Luck NeXt Time");
        }



    }
}
