package com.net.medium;

import java.util.Arrays;

public class CheckIfAnagram {

    public static void main(String args[]) {

        int i=isAnagram("harika","hakwia");
        if(i==-1)
        {
            System.out.println("Not anagram");
        }
        else
        {
            System.out.println("Anagram");
        }
    }

    public static int isAnagram(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
           return -1;

        }
        else{
            int[] c= new int[26];
            for(int i=0;i<str1.length();i++)
            {

               c[str1.charAt(i) -'a']++;
            }

            for(int i=0;i<str2.length();i++)
            {
                c[str2.charAt(i)-'a']--;
            }

            int total=0;
            for(int i:c)
            {
                total=total+Math.abs(i);
            }


            if(total==0)
            {
                return 1;
            }
            else
                return -1;
        }

    }
}
