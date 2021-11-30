import java.util.InputMismatchException;
import java.util.Scanner;

public class CodingAssessment {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        Scanner sc = new Scanner(System.in);
        System.out.println(fan.getStatus());
        int cordChoice = 1;
        System.out.println("Input a number to pull a cord: 1 to pull the speed cord, 2 to pull the reverse cord, or 0 to quit.");
        while(cordChoice != 0) {
            try {
                cordChoice = sc.nextInt();
                if(cordChoice == 1) { fan.pullSpeedCord(); }
                else if(cordChoice == 2) { fan.pullReverseCord(); }
                else if(cordChoice != 0) { throw new InputMismatchException(); }
            }   
            catch (InputMismatchException e) {
                System.out.println("Error with input,");
                System.out.println("Input a number to pull a cord: 1 to pull the speed cord, 2 to pull the reverse cord, or 0 to quit.");
                sc.nextLine();
                cordChoice = 1;
            }
            finally {
                System.out.println(fan.getStatus());
            }
        }
        sc.close();
    }
}