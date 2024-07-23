package LinkedInPrograms;

import java.util.ArrayList;
import java.util.List;

public class LeaderNumInArray {

    public static void main(String args[])
    {
        int[] nums={16, 17, 4, 3, 5, 2};
       List<Integer> value= leader(nums);
        System.out.println(value);
    }

    public static List<Integer> leader(int[] nums)
    {

        int max_right=nums[nums.length-1];

        List<Integer> values= new ArrayList<>();

        values.add(max_right);
        for(int i=nums.length-1;i>=0;i--)
        {

            if(max_right<nums[i])
            {
                max_right=nums[i];
                System.out.println(max_right+" ");
                values.add(max_right);
            }
        }

        return values;
    }
}
