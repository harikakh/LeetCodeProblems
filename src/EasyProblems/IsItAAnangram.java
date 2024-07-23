package EasyProblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IsItAAnangram {
    //https://www.hackerrank.com/challenges/anagram/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

    public static void main(String[] args)
    {

        System.out.println(testAnagram("xyyx"));
    }

    public static int testAnagram(String s)
    {
        if(s.length()%2 !=0)
        {
            return -1;
        }
        String str1=s.substring(0,s.length()/2);
        String str2=s.substring(s.length()/2,s.length());;

      int[] c =new int[26]; //because 26 characters

        for(int i=0;i<str1.length();i++)
        {
            c[str1.charAt(i) - 'a']++;

        }

        for(int j=0;j<str2.length();j++)
        {
            c[str2.charAt(j) -'a']--;
        }


        int total=0;
        for(int k:c)
        {
            total=total+Math.abs(k);
        }
       return total/2;
    }
}
