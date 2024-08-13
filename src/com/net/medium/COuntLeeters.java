package com.net.medium;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class COuntLeeters {

    public static void main(String args[]) {
        countMap("harika");
    }

    public static void countMap(String str)
    {
        HashMap<Character ,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
           map.putIfAbsent(str.charAt(i),1);
        }

        map.forEach((a,b)->System.out.println(a+" "+b));

        map.forEach((k,v)->System.out.println(k+" "+v));

        for(Map.Entry<Character, Integer> ma: map.entrySet())
                {
                    System.out.println(ma.getKey()+","+ma.getValue());
                }

        String[] names=new String[2];
        names[0]="harika";
        names[1]="korada";
       for(String a: names)
       {
           System.out.println(a);
       }

    }
}
