package amcat;
import java.util.Scanner;
/*
 * @author Sourabh
 */
public class LCM {
    static int lcm(int a, int b) {
        // maximum number between a and b is stored in lcm
        int lcm = (a > b) ? a : b;
        // Always true
        while(true) {
            if( lcm % a == 0 && lcm % b == 0 ) {
                // System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
                break;
            }
            ++lcm;
        }
        return lcm;
    }
    static int gcd(int a, int b) {
        int gcd = 1, lcm = 1;
        for(int i = 1; i <= a && i <= b; ++i)
        {
            // Checks if i is factor of both integers
            if((a % i == 0) && (b % i == 0))
                gcd = i;
        }
        lcm = (a * b) / gcd;
        System.out.println("LCM from GCD: " + lcm);
        return gcd;
    }
    static int gcdOfArray(int[] ar) {
        int gcd = 1, c = ar[0], d, lcm = 1;
        for (int j = 1; j < ar.length; j++) {
            d = ar[j];
            for(int i = 1; i <= c && i <= d; ++i)
            {
                // Checks if i is factor of both integers
                if((c % i == 0) && (d % i == 0))
                    gcd = i;
            }
            lcm = (c * d) / gcd;
            c = gcd;
        }
        return gcd;
    }
    static int lcmOfArray(int[] ar) {
        int c = ar[0], d, lcm = 1;
        for (int i = 1; i < ar.length; i++) {
            d = ar[i];
            lcm = (c > d) ? c : d;
            while(true) {
                if((lcm % c == 0) && (lcm % d == 0)) {
                    break;
                }
                ++lcm;
            }
            c = lcm;
        }
        return lcm;
    }
    public static void main(String[] args) {
        System.out.println("Enter two number followed by single space to find LCM of that: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM of given numbers: " + lcm(a, b));
        System.out.println("GCD of given numbers: " + gcd(a, b));
        System.out.println("Enter size of array: ");
        int sizearr = sc.nextInt();
        int ar[] = new int[sizearr];
        for(int i = 0; i < sizearr; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("LCM of given array: " + lcmOfArray(ar));
        System.out.println("GCD of given array: " + gcdOfArray(ar));
    }
}
