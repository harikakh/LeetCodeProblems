package EasyProblems;



import java.util.*;

public class BirthdayCandles {

    //https://www.hackerrank.com/challenges/birthday-cake-candles/problem
    public static void main(String args[])
    {
            List<Integer> value=Arrays.asList(3,4,1,2,4,4);

        System.out.println(candleCount(value));
    }

    public static int candleCount(List<Integer> values)
    {

       int maxVal= values.stream().max(Comparator.naturalOrder()).get();

        long count =values.stream().filter(c->c==maxVal).count();

        return (int) count;
    }
}
