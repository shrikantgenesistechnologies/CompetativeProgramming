package amcat;

import java.util.Scanner;

/*
 * @author Sourabh
 */
public class HollowSquarePattern {
    static void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || i == (n-1)) {
                    System.out.print("*");
                } else if(j == 0 || j == (n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for print Hollow Square Pattern: ");
        int n = sc.nextInt();
        squarePattern(n);
    }
}
