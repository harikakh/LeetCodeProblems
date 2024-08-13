package LinkedInPrograms;

public class MinAndMaxNumberInArray {

    public static void main(String args[])
    {
        int[] arrau={1,3,2,4,1,232};
        int min=arrau[0];
        int max=arrau[0];

        for(int i=0;i<arrau.length;i++)
        {
            if(arrau[i]<min)
            {
                min=arrau[i];
            }
           else if(arrau[i]>max)
            {
                max=arrau[i];
            }
        }

        System.out.println(min +"  "+ max);
    }

}
