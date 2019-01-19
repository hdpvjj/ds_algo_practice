package com.jinugu.vijay.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestStringNonRepeat {
    public static int lengthOfLongestSubstring(String s) {
        if(s == null)
            return -1;
        int longestStringLength = 0;
        int currLength = 0;
        Set<Character> seenChars = new HashSet<Character>();
        char[] chars = s.toCharArray();
        for(int i = 0;i<s.length();i++ ){
            if(seenChars.contains(chars[i])){
                seenChars = new HashSet<Character>();
                seenChars.add(chars[i]);
                longestStringLength = longestStringLength > currLength ? longestStringLength :  currLength;
                currLength = 1;
            }else{
                seenChars.add(chars[i]);
                currLength++;
            }
        }
        return longestStringLength > currLength ? longestStringLength : currLength;
    }

    public static void main(String args[]){
        System.out.print("Output: ");
        System.out.println(lengthOfLongestSubstring("DVDF"));
    }
}
