package amcat;

import java.util.Scanner;

/*
 * @author Sourabh
 */
public class SquarePattern {
    static void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for print Square Pattern: ");
        int n = sc.nextInt();
        squarePattern(n);
    }
}
