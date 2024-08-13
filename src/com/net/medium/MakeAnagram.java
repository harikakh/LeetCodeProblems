package com.net.medium;

public class MakeAnagram {
    public static void main(String args[])
    {
        makeAnagram("harika","riedkaha");
    }

    public static void makeAnagram(String str1,String str2)
    {
        int[] c = new int[26];
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        for(int i=0;i<str1.length();i++)
        {
            c[str1.charAt(i)- 'a']++;
        }

        for(int i=0;i<str2.length();i++)
        {
            c[str2.charAt(i)-'a']--;
        }
int total=0;
        for(int i:c)
        {
            total+=Math.abs(i);
        }

        System.out.println(total);
    }
}
