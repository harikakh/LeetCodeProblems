package LinkedInPrograms;

import java.util.Arrays;

public class MissingNumberInSeries {

    public static void main(String args[])
    {
        int[] numbers=new int[]{0,1,2,3,4,6,7};

        System.out.println(findMissingNumber(numbers));
    }


    public static int findMissingNumber(int[] nums) {

        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int n=nums.length;
        int expectedSum=n*(n+1)/2;

        return expectedSum-sum;


    }

}
