package amcat;
import java.util.Scanner;
/*
 * @author Sourabh
 */
public class Enchiper {
    public static void main(String[] args) {
        System.out.println("Enter character(a/A - z/Z) and number(0 - 25) followed by single space:  ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int key = sc.nextInt();
        
        //Reverse key number program
        StringBuffer sb = new StringBuffer(String.valueOf(key));
        sb.reverse();
        int rev_key = Integer.parseInt(sb.toString());
        System.out.println("reverse string sb: " + rev_key);
        if(key == rev_key) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NO PALINDROME");
        }
        
        //ENCIPHER PROGRAM
        System.out.println("Character : " + ch + " Number : " + key);
        char offset;
        if(ch >= 'a' && ch <= 'z') {
            offset = (char) (((ch-'a') + key) % 26);
            System.out.println((char)('a'+offset));
        } else if(ch >= 'A' && ch <= 'Z') {
            offset = (char) (((ch-'A') + key) % 26);
            System.out.println((char)('A'+offset));
        }
    }
}
