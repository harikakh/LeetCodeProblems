package LinkedInPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class TopTwoMaxNumsInArray {
    public static void main(String args[])
    {
        int nums[]={5,34,78,2,45,1,99,23};

        Arrays.sort(nums);
        System.out.println(nums[nums.length-1]+"  "+nums[nums.length-2]);


    }
}
