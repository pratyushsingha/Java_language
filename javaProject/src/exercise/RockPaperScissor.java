package exercise;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        System.out.println("Enter Ur Play(1 for Rock...2 for Paper....3 for Scissor:");
        //taking Input From User
        int Player = sc.nextInt();
     //   generating Random Values
        int Computer = rm.nextInt(3)+1;
//assigning values with Rock Paper Scissor
        if (Computer==1){
            System.out.println("Computer play is:Rock");
        }
        else if (Computer==2){
            System.out.println("Computer play is:Paper");
        }
        else if (Computer==3){
            System.out.println("Computer play is:Scissor");
        }
        //who wins
        if (Player==Computer){
            System.out.println("Tie");
        } else if (Player == 1 && Computer == 3 || Player == 2 && Computer == 1
                || Player == 3 && Computer == 2) {
            System.out.println("Hurrrahhhh>>>>>>> U Win!!!");
        }
else {
            System.out.println("U lose!!!!");
        }

    }

}
