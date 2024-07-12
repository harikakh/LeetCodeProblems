package EasyProblems;

public class MaximumSubArraySum_KadaneAlgorithm {

    public static void main(String args[])
    {
        int[] arr={-2,-5,6,-2,-3,1,5,-6};

        maxSumOfSubArray(arr);
    }

    public static int maxSumOfSubArray(int[] arr)
    {
      int curr_sum=arr[0];
      int max_sum=arr[0];

      for(int i=1;i<arr.length;i++)
      {

          curr_sum=Math.max(curr_sum,arr[i]-curr_sum);
          max_sum=Math.max(curr_sum,max_sum);
      }
        return max_sum;
    }
}
