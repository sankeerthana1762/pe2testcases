package com.stackroute.junit;

//checking whether the given input is divided by four or not

public class PowerOfFour {
    public String powerOfFour(int n) {

        if(n == 0)
            return "error";
        while(n != 1)
        {
            if(n % 4 != 0)
                return "error";
            n = n / 4;
        }
        return "power of four";
    }
}



