package com.jinugu.vijay.strings;

public class TwoStringSum {
    public String addStrings(String num1, String num2) {
        int l = num1.length() > num2.length() ? num1.length() : num2.length();
        int l1 = num1.length();
        int l2 = num2.length();
        char[] result = new char[l];
        StringBuilder sb = new StringBuilder(l);
        int carry = 0;
        int n1, n2;

        while(l1 > 0 || l2 > 0){
            n1 = l1 > 0 ? num1.charAt(l1 - 1) - '0' : 0;
            n2 = l2 > 0 ? num2.charAt(l2 - 1) - '0' : 0;
            result[l-1] = (char) ((carry + n1 + n2) % 10);
            sb.insert(l-1,(carry + n1 + n2) % 10);
            carry = (n1 + n2) / 10;
            l1--;
            l2--;
            l--;
        }
        if(carry > 0){
            sb.insert(l-1, carry);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        TwoStringSum obj = new TwoStringSum();
        System.out.println(obj.addStrings("100","275"));
    }
}
