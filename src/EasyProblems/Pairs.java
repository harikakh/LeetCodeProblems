package EasyProblems;

import java.util.Arrays;

public class Pairs {
//https://www.hackerrank.com/challenges/pairs/problem
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
                int target=1;
        System.out.println(findCountOfPairs(arr,target));
    }

    public static int findCountOfPairs(int arr[],int target)
    {
        Arrays.sort(arr);

        int result=0;

        for(int i:arr)
        {
            int finder=i-target;
            if(binarySearcg(arr,finder))
            {
                result++;
            }
        }

       return result;
    }

    public static boolean binarySearcg(int arr[],int find)
    {
        int firstterm=0;
        int lastterm=arr.length-1;

        while(firstterm <= lastterm) {
            int middle = (firstterm + lastterm) / 2;

            int middleTerm = arr[middle];

            if (middleTerm == find) {
                return true;
            }

            if(find>middleTerm)
            {
                firstterm=middle+1;
            }
            if(find<middleTerm)
            {
                lastterm=middle-1;
            }
        }
        return  false;
    }
}
