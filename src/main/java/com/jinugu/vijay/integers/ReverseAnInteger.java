package com.jinugu.vijay.integers;

public class ReverseAnInteger {
    public int reverse(int n) {
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

    public static void main(String[] args) {
        ReverseAnInteger solution = new ReverseAnInteger();
        System.out.println("Result:" + solution.reverse(1534236469));
    }
}
