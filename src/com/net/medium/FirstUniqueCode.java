package com.net.medium;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class FirstUniqueCode {

    public static void main(String args[]) {

        String input="iloveToCode";

  String sm  = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(c->c.getValue()==1).findFirst().get().getKey();
        System.out.println(sm);

       input= input.toLowerCase();

        int[] c= new int[26];
        for(int i=0;i<input.length();i++)
        {
            c[input.charAt(i) -'a']++;
        }

        for(int i=0;i<input.length();i++)
        {
            if(c[input.charAt(i) -'a']==1)
            {
                System.out.println(input.charAt(i));
                return;
            }
        }
        System.out.println("no repeating chars");
    }

}
