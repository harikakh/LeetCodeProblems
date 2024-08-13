package LinkedInPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapUsingValues {


    public static void main(String args[])
    {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);


       LinkedHashMap<String,Integer> sortedMap= hm.entrySet().stream().sorted((m1,m2)->m1.getValue().compareTo(m2.getValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(m1,m2)-> m1,LinkedHashMap::new));

        System.out.println(sortedMap);


       LinkedHashMap<String,Integer> sort= hm.entrySet().stream().sorted((t1,t2)->t1.getValue().compareTo(t2.getValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(t1,t2)->t1,LinkedHashMap::new));


    }












}
