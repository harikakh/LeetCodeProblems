package EasyProblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SherlockAndPairOfString {
    //https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
    public static void main(String args[]) {
        System.out.println(isSherloc());
    }

    public static String isSherloc()
    {
        String s="ABBCDDAE";

        Map<Character,Long> mapString= s.chars().mapToObj(c->(char )c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //  int value=0;
        Collection<Long> values=mapString.values();
//Sorting is important for the conditions to satisfy
        List<Long> val=values.stream().sorted().collect(Collectors.toList());

        if(val.size()==1)
        {
            return "YES";
        }
        int first=val.getFirst().intValue();
        int last =val.getLast().intValue();
        int second=val.get(1).intValue();
        int lastsecond=val.get(val.size()-2).intValue();

        if(first==last)
        {
           return "YES";
        }
        if(first==1 && second==last)
        {
          return "YES";
        }
        if(first==second && second==lastsecond && lastsecond==(last-1))
        {
           return "YES";
        }

       return "NO";


    }
}
