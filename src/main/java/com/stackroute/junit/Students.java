package com.stackroute.junit;

//display the average ,minimum and maximum marks
public class Students {
    public int average(int arr[])
{
    int sum=0 ;
    for(int element:arr){
        sum+=element;
    }
    return sum/arr.length;

}
    public int minimumOfMarks(int arr[])
    {
        int minimum=arr[0] ;
        for(int element:arr){
            if(element<minimum)
                minimum=element;
        }
        return minimum;

    }
    public int maximumOfMarks(int arr[])
    {

        int maximum=arr[0] ;
        for(int element:arr){
            if(element> maximum)
                maximum=element;
        }
        return maximum;
    }


}
