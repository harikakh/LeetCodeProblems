package LinkedInPrograms;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String args[])
    {

    }

    public static List<Map.Entry<String, Integer>> nthHighestSalary(int k, Map<String,Integer> map)
    {
    return   map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
    }
}
