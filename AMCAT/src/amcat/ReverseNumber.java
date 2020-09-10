package amcat;
import java.util.Scanner;

/*
 * @author Sourabh
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for reverse: ");
        StringBuilder num = new StringBuilder(String.valueOf(sc.nextInt()));
        num.reverse();
        int n = Integer.parseInt(num.toString());
        System.out.println("Reverse Number: " + n);
    }
}
