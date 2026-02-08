package org.LukDT.Task_3;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("А роза упала на лапу Азора"));
    }

    public static boolean isPalindrome(String str) {
        if(str == null) return false;

        String pal = str.toLowerCase().replaceAll("\\s+", "");

        if(pal.isEmpty()) return false;

        for(int i = 0, j = pal.length() - 1; i < j; i++, j--) {
            if(pal.charAt(i) != pal.charAt(j)) return false;
        }

        return true;
    }
}
