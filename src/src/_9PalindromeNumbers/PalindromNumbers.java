package _9PalindromeNumbers;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class PalindromNumbers {
    public boolean isPalindrome(int x) {
        if (x < 0 ||  (x != 0 && x%10 == 0)) {
            return false;
        }
        long reverse = 0;
        long og = x;
        while(reverse < og) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        if (og == reverse) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int x = obj.nextInt();

        PalindromNumbers palindromeCheck = new PalindromNumbers();
        boolean results = palindromeCheck.isPalindrome(x);

        System.out.print(results);
    }
}
