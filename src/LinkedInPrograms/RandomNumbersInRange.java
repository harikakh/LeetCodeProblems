package LinkedInPrograms;

import java.util.Random;
import java.util.random.RandomGenerator;

public class RandomNumbersInRange {

    public static void main(String args[])
    {

        System.out.println(generateRandomNumbers(1,10));

        System.out.println(randomRangeMath(1,10));

    }

    public static int generateRandomNumbers(int start,int end)
    {
       Random random = new Random();
       int ranNum=random.nextInt((end-start)+1)+start;
       return ranNum;
    }

    public static int randomRangeMath(int start, int end)
    {
        int range=end - start; //Calculate our range
        double randomDouble=Math.random(); //returns a double
        double calc = (randomDouble*range)+start; //calculation returns 6.5
        long number =Math.round(calc);

        return (int)number;


    }
}
