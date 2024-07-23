package LinkedInPrograms;

import java.util.HashSet;

public class DuplicateNumber {

    public static void main(String args[]) {

        int[] nums={1,3,4,2,2};
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {

           if( hashSet.contains(nums[i]))
           {
               System.out.println( nums[i]);
           }
           else
               hashSet.add(nums[i]);
        }



    }

}
