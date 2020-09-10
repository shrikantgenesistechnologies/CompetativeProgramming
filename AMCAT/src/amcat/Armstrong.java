package amcat;
import java.util.Scanner;
/*
 * @author Sourabh
 */
public class Armstrong {
    public static boolean isArmstrong(int n) {
        int num, num2,sum = 0;
        String num_s = String.valueOf(n);
        int len = num_s.length();
        int n1 = Integer.parseInt(num_s);
        num2 = n1;
        while(n1 != 0) {
            num = n1 % 10;
            sum = (int) (sum + Math.pow(num, len));
            n1 = n1 / 10;
        }
        return sum == num2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //SINGLE NUMBER CHECK ARMSTRONG OR NOT
        System.out.println("Enter number for checking it is armstrong or not: ");
        int num = sc.nextInt();
        if(isArmstrong(num)) {
            System.out.println("Number is Armstrong.");
        } else {
            System.out.println("Number is not Armstrong.");
        }
        //HOW MANY ARMSTRONG NUMBER IN BETWEEN RANGE
        System.out.println("Enter range's start number and end number for print armstrong numbers only: ");
        int s_num = sc.nextInt();
        int e_num = sc.nextInt();
        int armstrong = 0;
        System.out.println("Armstrong Numbers between given range: ");
        for(int i = s_num; i < e_num; i++) {
            if(isArmstrong(i)) {
                armstrong++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal " +armstrong+ " Armstrong Numbers between given range.");
    }
}
