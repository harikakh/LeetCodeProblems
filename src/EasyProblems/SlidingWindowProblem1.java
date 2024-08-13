package EasyProblems;

import java.util.Scanner;
import  java.util.*;

public class SlidingWindowProblem1 {

    public static void main(String args[])
    {
      /*  List<Integer>  inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i=0;
       while (i<10)
       {
           System.out.println("Enter the numbers");
           inputList.add(scanner.nextInt());
           i++;
       }

        System.out.println(inputList);*/



    }

    public static void shortestSlidingWindow(int target,Integer[] arr)
    {
        int currSum=0;
        int minWin=Integer.MAX_VALUE;

        //two pointers
        int low=0;
        int high=0;

        while(high<arr.length)
        {
            currSum+=arr[high];
            high++;

            while(currSum>=target)
            {
                int currentWindowSize = high-low;

                minWin=Math.min(currentWindowSize,minWin);
                currSum-=arr[low];
                low++;
            }
        }



    }
}
