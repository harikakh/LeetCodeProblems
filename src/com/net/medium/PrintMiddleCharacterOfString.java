package com.net.medium;

public class PrintMiddleCharacterOfString {

    public static void main(String args[])
    {
        System.out.println("middle character is "+middleCharOfString("harikat"));
    }

    public static String middleCharOfString(String name)
    {
        int halfLength=name.length()/2;
        if(name.length()%2==0)
        {
            return name.substring(halfLength-1,halfLength+1);
        }
        else
        {
            return name.substring(halfLength,halfLength+1);
        }
    }
}
