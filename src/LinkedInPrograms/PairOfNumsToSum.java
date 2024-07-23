package LinkedInPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class PairOfNumsToSum {
    public static void main(String args[])
    {

        int[] arr={ 1, 5, 7, -1, 5 };

        Arrays.sort(arr);
        int sum=12;
        int count=0;

       int first=0;
       int last=arr.length-1;

       while(first<last)
       {
           if(arr[first]+arr[last]==sum)
           {
               System.out.println(arr[first]+"  "+arr[last]);
               last--;
               first++;
               count++;
           }
           else if(arr[first]+arr[last]<sum)
           {
               first++;
           }
           else if(arr[first]+arr[last]>sum)
           {
               last--;
           }
       }

        System.out.println(count);
    }

   /* public static boolean booleanSearch(int[] arr,int find)

    {
        Arrays.sort(arr);

        int left=0;
        int right=arr.length-1;



        while(left<=right)
        {
            int mid=(left+right)/2;
            int midterm=arr[mid];

            if(midterm==find)
            {
                return true;
            }
             if(find>midterm)
            {
                left=mid+1;
            }
            if(find<midterm)
            {
                right=mid-1;
            }

        }
        return false;
    }*/
}
