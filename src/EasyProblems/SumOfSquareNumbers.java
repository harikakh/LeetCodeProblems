package EasyProblems;

public class SumOfSquareNumbers {

    public static void main(String args[])
    {
        System.out.println(IsItASumOfSquareRoots(90));
    }

    public static boolean IsItASumOfSquareRoots(int number)
    {

        if (number<0)
            return false;

        //Two pointers
        long left=0;
        long right = (int)Math.sqrt(number);
        long sum=0;
        while(left<=right)
        {
            sum=(left*left)+(right*right);

            if(sum==number)
            {
                return true;
            }
            else if(sum < number)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

    return false;
    }
}
