package EasyProblems;

public class PerfectSquare {

    public static void main(String args[])
    {
        System.out.println(isPerfectSquare(2));
    }

    public static boolean isPerfectSquare(int num)
    {
        if (num==1)
            return true;

        long left=0;
        long right=num/2;

        while (left<=right)
        {
           long mid=(left+right)/2;
           if(mid*mid==num)
           {
               return true;
           }
           else if(mid*mid>num)
           {
               right=mid;
               right--;
           }
           else
           {
               left=mid;
               left++;
           }


        }
        return false;
    }
}
