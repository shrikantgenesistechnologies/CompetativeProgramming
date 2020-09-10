package amcat;
import java.util.Scanner;
/*
 * @author Sourabh
 */
public class PrimeOrNot {
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //SINGLE NUMBER CHECK PRIME OR NOT
        System.out.println("Enter number for checking it is prime or not: ");
        int num = sc.nextInt();
        if(isPrime(num)) {
            System.out.println("Number is Prime.");
        } else {
            System.out.println("Number is not Prime.");
        }
        //HOW MANY PRIME NUMBER IN BETWEEN RANGE
        System.out.println("Enter range's start number and end number for print prime numbers only: ");
        int s_num = sc.nextInt();
        int e_num = sc.nextInt();
        int prime = 0;
        System.out.println("Prime Numbers between given range: ");
        for(int i = s_num; i < e_num; i++) {
            if(isPrime(i)) {
                prime++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal " +prime+ " Prime Numbers between given range.");
    }
}
