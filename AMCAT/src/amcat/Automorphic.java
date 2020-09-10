package amcat;
import java.util.Scanner;
/*
 * @author Sourabh
 */
public class Automorphic {
    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        while(n > 0) {
            if((n % 10) != (sq % 10)) {
                return false;
            }
            n = n / 10;
            sq = sq / 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //SINGLE NUMBER CHECK Automorphic OR NOT
        System.out.println("Enter number for checking it is Automorphic or not: ");
        int num = sc.nextInt();
        if(isAutomorphic(num)) {
            System.out.println("Number is Automorphic.");
        } else {
            System.out.println("Number is not Automorphic.");
        }
        //HOW MANY Automorphic NUMBER IN BETWEEN RANGE
        System.out.println("Enter range's start number and end number for print Automorphic numbers only: ");
        int s_num = sc.nextInt();
        int e_num = sc.nextInt();
        int Automorphic = 0;
        System.out.println("Automorphic Numbers between given range: ");
        for(int i = s_num; i < e_num; i++) {
            if(isAutomorphic(i)) {
                Automorphic++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal " +Automorphic+ " Automorphic Numbers between given range.");
    }
}
