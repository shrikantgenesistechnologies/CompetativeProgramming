package amcat;
import java.util.Scanner;
/*
 * @author Sourabh
 */
public class Strong {
    public static boolean isStrong(int n) {
        int fact, sum = 0, num, n1 = n;
        while(n != 0) {
            fact = 1;
            num = n % 10;
            for(int i = 1; i <= num; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        return (sum == n1) ? true : false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //SINGLE NUMBER CHECK STRONG OR NOT
        System.out.println("Enter number for checking it is Strong or not: ");
        int num = sc.nextInt();
        if(isStrong(num)) {
            System.out.println("Number is Strong.");
        } else {
            System.out.println("Number is not Strong.");
        }
        //HOW MANY STRONG NUMBER IN BETWEEN RANGE
        System.out.println("Enter range's start number and end number for print Strong numbers only: ");
        int s_num = sc.nextInt();
        int e_num = sc.nextInt();
        int Strong = 0;
        System.out.println("Strong Numbers between given range: ");
        for(int i = s_num; i < e_num; i++) {
            if(isStrong(i)) {
                Strong++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal " +Strong+ " Strong Numbers between given range.");
    }
}
