package EasyProblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MissingNumbers {

    //Need to find out the missing numbers in movedArr as compared to mainArray
    //Time COmplexite: O[n] as that is the time taken to travers the big array
    //Space Complexity: O(n) as the Treemap would take the O(n)space
    //https://www.hackerrank.com/challenges/missing-numbers/problem
    public static void main(String args[])
    {
        Integer[] mainArr={7,2,5,4,6,3,5,3,1,2,1};
        Integer[] movedArr={7,2,5,3,5,3,1};

        TreeMap<Integer,Integer> mainTree=new TreeMap<>();
        List<Integer> arrList= new ArrayList<>();

        for(int main : mainArr)
        {
            if(mainTree.containsKey(main))
            mainTree.put(main,mainTree.get(main)+1);
            else {
                mainTree.put(main, 1);
            }
        }
        System.out.println(mainTree);
        System.out.println("**********");

        for(int move: movedArr)
        {
          int freq=mainTree.get(move);
          freq--;

          if(freq==0)
          {
              mainTree.remove(move);
          }
          else
          {
              mainTree.put(move,freq);
          }
        }

        System.out.println(mainTree);

        //Create the result array
        List<Integer> result= new ArrayList<>(mainTree.size());
        int i =0;
        for(Map.Entry<Integer,Integer> maa : mainTree.entrySet())

        {
            result.add(i++,maa.getKey());

        }

        for(int j=0;j<result.size();j++)
        {
            System.out.println(result.get(j));
        }
        Arrays.asList(result).stream().forEach(c->System.out.println(c));
       /*
       My implementation
       Map<Integer, Long> mainArra=Arrays.asList(mainArr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Integer, Long> movedArra=Arrays.asList(movedArr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(mainArra);
        System.out.println(movedArra);
     Set<Integer> mainKeys=mainArra.keySet();
     Set<Integer> movedKeys=movedArra.keySet();

        TreeSet<Integer> result =new TreeSet<>();
    for (Integer mainkey : mainKeys) {
        if(!(movedKeys.contains(mainkey)))
        {
           result.add(mainkey);
        }
        else if (!(movedArra.get(mainkey)==mainArra.get(mainkey)))
        {
            result.add(mainkey);
        }

    }

        System.out.println(result);*/






    }
}
