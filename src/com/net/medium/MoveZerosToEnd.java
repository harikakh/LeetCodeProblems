package com.net.medium;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String args[])
    {
        int[] nums={9,0,78,0,0,67,0,0,1};

        nums=moveZerosToEnd(nums);
       Arrays.stream(nums).forEach(System.out::println);
    }

    private static int[] moveZerosToEnd(int nums[])
    {


        int insertPosition=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                nums[insertPosition]=nums[i];
                insertPosition++;
            }
        }

        while(insertPosition<nums.length)
        {
            nums[insertPosition++]=0;
        }
        return nums;
    }
}
