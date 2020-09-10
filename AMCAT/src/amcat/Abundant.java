package amcat;
import java.util.Scanner;
/*
 * @author Sourabh
 */
public class Abundant {
    public static boolean isAbundant(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if((n % i) == 0) {
                sum += i;
            }
        }
        return (sum > n) ? true : false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //SINGLE NUMBER CHECK ABUNDANT OR NOT
        System.out.println("Enter number for checking it is Abundant or not: ");
        int num = sc.nextInt();
        if(isAbundant(num)) {
            System.out.println("Number is Abundant.");
        } else {
            System.out.println("Number is not Abundant.");
        }
        //HOW MANY ABUNDANT NUMBER IN BETWEEN RANGE
        System.out.println("Enter range's start number and end number for print Abundant numbers only: ");
        int s_num = sc.nextInt();
        int e_num = sc.nextInt();
        int Abundant = 0;
        System.out.println("Abundant Numbers between given range: ");
        for(int i = s_num; i < e_num; i++) {
            if(isAbundant(i)) {
                Abundant++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal " +Abundant+ " Abundant Numbers between given range.");
    }
}
