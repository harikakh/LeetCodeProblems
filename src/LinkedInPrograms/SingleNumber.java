package LinkedInPrograms;

import java.util.*;
public class SingleNumber {

    public static void main(String args[])
    {
        int[] nums={2,2,1};
        HashMap<Integer,Integer> values= new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(values.containsKey(nums[i]))
            {
                values.put(nums[i],values.get(nums[i])+1);
            }
            else
            {
                values.put(nums[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> value:values.entrySet())
        {
            if(value.getValue()==1)
            {
                System.out.println(value.getKey());
            }
        }
        System.out.println("not found");
    }
}
