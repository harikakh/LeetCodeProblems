package EasyProblems;

import java.util.Arrays;

public class MergeSortedArray {
//https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
    public static void main(String args[])
    {

      /* int[] nums1={1,2,3,0,0,0};
       int[] nums2={2,5,6};
        nums1= merge(nums1,3,nums2,3);*/

        int[] nums1={0};
        int[] nums2={1};
        nums1=merge(nums1,0,nums2,1);
        Arrays.stream(nums1).forEach(System.out::println);
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j=0,i=m;j<n;j++)
        {

            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
       return nums1;

    }
}
