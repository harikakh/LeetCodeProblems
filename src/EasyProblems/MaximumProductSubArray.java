package EasyProblems;

public class MaximumProductSubArray {

    public static void main(String args[])
    {

        int[] nums={0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        System.out.println( maxProductInSubArray(nums));
    }

    public static int maxProductInSubArray(int[] nums)
    {
        int n=nums.length;
        int leftproduct=1;
        int rightproduct=1;
        int ans=nums[0];

        for(int i=0;i<n;i++)
        {

            leftproduct=leftproduct==0?1:leftproduct;
            rightproduct=rightproduct==0?1:rightproduct;

            leftproduct*=nums[i];

            rightproduct*=nums[n-1-i];

            ans=Math.max(ans,Math.max(leftproduct,rightproduct));
        }

        return ans;
    }
}
