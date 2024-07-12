package EasyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunnyString {

    public static void main(String[] args)
    {
        System.out.println(isFunny("bcxz"));
    }

    public static String isFunny(String s)
    {

        String revString= Stream.of(s).map((word)-> new StringBuilder(word).reverse()).collect(Collectors.joining());
        System.out.println(revString);
       List<Integer> val= new ArrayList<>();
        List<Integer> revval= new ArrayList<>();

       val= asciiArray(s);
       revval =asciiArray(revString);

        List<Integer> val2= new ArrayList<>();
        List<Integer> revval2= new ArrayList<>();

        val2=diffArray(val);
       revval2=diffArray(revval);

        if(val2.equals(revval2))
        {
            return "Funny";
        }
      return "Not Funny";

    }

    public  static List<Integer> asciiArray(String str)
    {
        List<Integer> val= new ArrayList<>();

        for(char c:str.toCharArray())
        {
            val.add((int)c);
        }
        return val;
    }

    public static List<Integer> diffArray(List<Integer> input)
    {
        List<Integer> diffList= new ArrayList<>();
        for(int i=1;i<input.size();i++)
        {
            int diff=Math.abs(input.get(i-1)-input.get(i));
            diffList.add(diff);
        }
    return diffList;
    }
}
