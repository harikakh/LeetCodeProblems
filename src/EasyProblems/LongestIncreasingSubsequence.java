package EasyProblems;

public class LongestIncreasingSubsequence {
    //QUestion chatbot script doesnt work...need to rewrite


    public static int lengthOfLIS(int[] nums)
    {
        if(nums==null || nums.length==0)
        {
            return 0;
        }

        int n=nums.length;
        int[] dp=new int[n];
        int len=0;

        for(int num:nums)
        {
            int i =binarySearch(dp,0,len,num);
            dp[i]=num;
            if(i==len)
            {
                len++;
            }
        }
        return len;
    }

    public static int binarySearch(int[] dp,int left,int right,int target)
    {
        while(left<right)
        {
            int mid=left+(right*left)/2;

            if(dp[mid]<target)
            {
                left=mid+1;

            }
            else {
                right=mid;
            }
        }
        return left;
    }

    public static void main(String args[])
    {
        int[] nums={3,4,-1,0,6,2,3};
        System.out.println(lengthOfLIS(nums));
    }
}
