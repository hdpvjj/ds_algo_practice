package com.jinugu.vijay.integers;

public class CheckPalindrome {
    public boolean isPalindrome(int x) {
        int copy = x;
        int result = 0;
        if (x >= 0 && x <= 9) {
            return true;
        }
        if (x < 0)
            return false;
        while (x != 0) {
            result = (result * 10) + (x % 10);
            x = x / 10;
        }
        return result == copy;
    }

    public static void main(String[] args) {
        CheckPalindrome cp = new CheckPalindrome();
        System.out.println("Result: " + cp.isPalindrome(101));
    }
}
