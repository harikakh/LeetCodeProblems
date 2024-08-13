package com.net.medium;

public class BinarySearch {



    public static void main(String args[])
    {

        int[] arr={1,34,55,4343,5678};
        System.out.println(performBinarySearch(arr,5609));
    }

    public static boolean performBinarySearch(int[] arr, int search)
    {

        int first =0;
        int last=arr.length-1;

        while (first<=last)
        {
            int mid=(first+last)/2;
            int midterm=arr[mid];

            if(search==midterm)
            {
                return true;
            }
             else if(search<midterm)
            {
                last=mid-1;

            }
            else if(search>midterm)
            {
                first=mid+1;

            }


        }
        return false;

    }
}


