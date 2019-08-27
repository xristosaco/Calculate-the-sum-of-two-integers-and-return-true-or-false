/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatethonumbers;

import java.util.Scanner;

/**
 *
 * @author xristos
 */
public class CalculateThoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int number = io.nextInt();
        System.out.println("Enter the second number :");
        int number2 = io.nextInt();
        System.out.println("Enter the third number :");
        int number3 = io.nextInt();
        System.out.println("he result is: " + result(number, number2, number3));

    }

    public static boolean result(int a, int b, int c) {
        return ((a + b) == c || (a + c) == b || (b + c) == a);
    }

}
