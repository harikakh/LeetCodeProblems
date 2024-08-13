package com.net.medium;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Questions {

    public static void main(String args[])
    {

        String name="thisisthetotalName";

        List<String> keys=Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().filter(s->s.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("duplicate keys"+keys);

        //Unique keys

        List<String> uniqueKeys=Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().filter(s->s.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());



        System.out.println(uniqueKeys);

        //First non repeating element  element
        //As hashmap doesnt maintain the order of inserting , we are getting randomly the first unique element from the map
        String firstNonRepeating=Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(s->s.getValue()==1).findFirst().get().getKey();
        System.out.println("duplicate keys"+firstNonRepeating);

        //to overcome the above issue , we need to use LinkedHashMap to maintain the order of insertion

       String firstUniqueKey= Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(s-> s.getValue()==1).findFirst().get().getKey();
        System.out.println(firstUniqueKey);


        //Second highest number from array

        int[] nums={5,2345,11,432,34,22};

       Integer val=Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println("Second highest value is"+val);

        //Second lowest number

        Integer lowest=Arrays.stream(nums).boxed().sorted().skip(1).findFirst().get();

        System.out.println(lowest);


        //Java program to find longest string from given array
        String[] strArray={"java","techie","sprintboot","microservices sdwe ewqweqweqw weqweqweq","microservicqw dfdrwer"};

        String longestWord=Arrays.stream(strArray).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();

        longestWord=Arrays.stream(strArray).max((word1,word2)->word1.length()-word2.length()).get();

        System.out.println(longestWord);

        //Java program to find all elements from array who starts with 1

        int[] arr={5,8,11,3,21,9,1};
        List<String> lst=Arrays.stream(arr).boxed()
                .map(s->s+"")//to convert integer to string we have to use map(s->s+"")
                .filter(s->s.startsWith("1")) //filter condition to check starts with s
                .collect(Collectors.toList());


        System.out.println(lst);


        //String .join example
        List<String> nos=Arrays.asList("32","23","3","6");

        String result=String.join("-",nos);
        System.out.println(result);


        //Skip limit example (2-9)

        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);

            //map and flatmap
    }


}
