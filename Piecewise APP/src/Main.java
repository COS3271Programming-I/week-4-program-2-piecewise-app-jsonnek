// Jonathan Sonnek
// February 12, 2026
// Piecewise App

import java.util.Scanner;
public class Main {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
        double y;
        int x;
//      Get number from user
        System.out.print("Enter a number: ");
        x = userinput.nextInt();
        userinput.nextLine();

//      Decide Which piece of the piecewise function to use based on the value of x
        if (x < 0) {
            y = 3 * (x) + 7;
            System.out.println("The solution is " + y);
        }
        else if (x >= 0 && x <= 10) {
            y = Math.pow(x, 2) + 8;
            System.out.println("The solution is " + y);
        }
        else if (x > 10) {
            y = Math.pow(x,3) - 6 *Math.pow(x,2);
            System.out.println("The solution is " + y);
        }
    }
}

