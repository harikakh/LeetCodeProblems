package com.net.medium;

import java.util.Arrays;

public class ReverseStringWithn2compleixyt {

    public static void main(String args[])
    {
        System.out.println(reverseString("This is my country"));
    }

    public static String reverseString(String name)
    {
        char reverse[]=name.toCharArray();
        int leftLength=reverse.length-1;

        for(int i=0;i<=leftLength;i++)
        {
            char temp =reverse[i];
            reverse[i]=reverse[leftLength];
            reverse[leftLength]=temp;
            leftLength--;
        }
        return Arrays.toString(reverse);
    }
}
