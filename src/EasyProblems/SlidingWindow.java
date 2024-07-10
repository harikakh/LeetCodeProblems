package EasyProblems;

public class SlidingWindow {
    //Maximum Average Subarray (Leetcode 643)
    /*
    QUestion: Given an integer array and an integer 'k'.
    Find the maximum average possible for a contiguous subarray of the size 'k'
     */
    public static void main(String[] args)
    {
   int[] arr={1,12,-5,-6,50,3,0,-45,23};
   int k=4;
int sum=0;
   for(int i=0;i<k;i++)
   {
      sum=sum+arr[i];
   }

    int maxSum = sum;

   int startIndex=0;
   int endIndex=k;
   while (endIndex<arr.length-1)
   {
       sum=sum-arr[startIndex];
       startIndex++;

       sum=sum+arr[endIndex];
       endIndex++;

       maxSum=Math.max(maxSum,sum);
   }


        System.out.println((double) maxSum/4);
    }
}
