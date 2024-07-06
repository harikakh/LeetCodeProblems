package EasyProblems;

import java.util.Arrays;
import java.util.List;

public class LeftRotation_Sol2 {

    //Rotate the array by k times using Reversing concept from n to m
    public static void main(String args[])
    {

        int[] nums={1,2,3,4,5};
        int k=4;
        //reverse all the array elements
        reverseArray(nums,0,nums.length-1);

        //reverse element till k

        reverseArray(nums,0,nums.length-1-k);
        reverseArray(nums,nums.length-k,nums.length-1);

       for (int n:nums)
           System.out.println(n);



    }

   public static void reverseArray(int[] nums,int start,int end)
   {
        while (start<end)
        {
            int temp =nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }

   }
}
