package LinkedInPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class TestDivision {

    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(12,34,54,23,23,43,55));


      /*  list=list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);*/

       list= list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);

        HashSet<Integer> set =new HashSet<>(list);
        System.out.println(set);
    }
}
