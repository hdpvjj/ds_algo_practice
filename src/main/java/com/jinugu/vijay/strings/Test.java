package com.jinugu.vijay.strings;

public class Test {
    public String reverseString(String inputString){
        char[] stringChars = inputString.toCharArray();
        char[] temp = new char[inputString.length()];
        for(int i = stringChars.length -1 ; i >= 0 ; i--){
            temp[(temp.length -1) -i] = stringChars[i];
        }
        return new String(temp);
    }

    public static void main(String[] args){
        Test testObj = new Test();
        System.out.println("Reversed String: " + testObj.reverseString("ABCD"));
    }
}
