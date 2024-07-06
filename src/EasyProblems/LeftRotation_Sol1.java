package EasyProblems;

import java.util.Arrays;

public class LeftRotation_Sol1 {

    //Rotate the array by k times
    public static void main(String args[])
    {

        Integer[] nums={1,2,3,4,5,6,7};
        leftRotate(nums,3);
    }

    public static Integer[] leftRotate(Integer nums[],int k)
    {
       // nums= new Integer[]{1, 2, 3, 4, 5, 6, 9};

        int lengthOfNums=nums.length;

        Integer[] temp = new Integer[k];

        for (int i =0; i<k;i++)
        {
            temp[i]=nums[i];

        }
        System.out.println(temp);

        for(int i=0;i<lengthOfNums-k;i++)
        {
            nums[i]=nums[i+k];
        }
        System.out.println(nums);
        int j=0;
        for(int i=lengthOfNums-k;i<lengthOfNums;i++)
        {

            nums[i]=temp[j];
            j++;
        }

        Arrays.asList(nums).forEach(System.out::println);
        return nums;
    }
}
