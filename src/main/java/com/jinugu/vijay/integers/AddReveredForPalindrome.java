package com.jinugu.vijay.integers;

public class AddReveredForPalindrome {
    private boolean isPalindrome(int x) {
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

    private int reverse(int n) {
        int result = 0;
        if (n <= 9 && n >= -9) {
            return n;
        }
        while (n != 0) {
            if (result > (Integer.MAX_VALUE / 10)) {
                return 0;
            }
            if (result < (Integer.MIN_VALUE / 10)) {
                return 0;
            }

            result = (result * 10) + n % 10;
            n = n / 10;
        }
        return result;
    }

    public int getAPalindrome(int n){
        int numToCheck = n + reverse(n);
        while(! isPalindrome(numToCheck)){
         n = numToCheck;
         numToCheck = n + reverse(n);
        }
        return numToCheck;
    }

    public static void main(String[] args){
        AddReveredForPalindrome obj = new AddReveredForPalindrome();
        System.out.println("Output: " + obj.getAPalindrome(256));
    }
}
