import javax.swing.*;
import java.util.Scanner;

public class onetohundred {
    public static void main(String[] args) {


           System.out.print("Enter first runners time: ");
           Scanner in = new Scanner(System.in);
           int firstRunner = in.nextInt();
           System.out.print("Enter second runners time: ");
           Scanner in1 = new Scanner(System.in);
           int secondRunner = in.nextInt();
           System.out.print("Enter third runners time: ");
           Scanner in2 = new Scanner(System.in);
           int thirdRunner = in.nextInt();
           while ((firstRunner < 0 || firstRunner > 50) || (secondRunner < 0 || secondRunner > 50) || (thirdRunner < 0 || thirdRunner > 50))

           {
               System.out.println("Please enter runners time again ");
               System.out.print("Enter first runners time: ");
               firstRunner = in.nextInt();
               System.out.print("Enter second runners time: ");
               secondRunner = in.nextInt();
               System.out.print("Enter third runners time: ");
               thirdRunner = in.nextInt();

           }
           int secondsSum = firstRunner + secondRunner + thirdRunner;
           int minutes = secondsSum / 60;
           int seconds = secondsSum % 60;
           System.out.print("The time is: " + minutes + ":" + seconds);


    }

}
