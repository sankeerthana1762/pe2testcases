package com.stackroute.junit;

//checking whether the input string is palindrome or not
public class Palindrome {
    public String palindromeandReverse(String input)
    {
        String reversed="";



        for(int i = input.length() - 1; i >= 0; i--)
        {
            reversed = reversed + input.charAt(i);
        }

        if(reversed==input)
        {
            return "Entered input is a palindrome";
        }
        else
        {
            return "entered input is not a palindrome";
        }

    }
}
