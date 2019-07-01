package com.stackroute.code;

public class Palindrome {
    public String validatePalindromeandReverse(String input)
    {
        String reversed="";
        String temp=input;
//        while(num != 0) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//            num /= 10;
//        }

        for(int i = input.length() - 1; i >= 0; i--)
        {
            reversed = reversed + input.charAt(i);
        }

        if(temp==input)
        {
            return "Entered input is a palindrome";
        }
        else
        {
            return "entered input is not a palindrome";
        }

    }
}
