package LinkedInPrograms;

import java.util.Arrays;

public class ProgramToMoveAllZerosToEndOfArray {

    public static void main(String args[])
    {
        int[] input={1,3,0,4,0,5,6};
        int insert=0;
        for(int i=0;i<input.length;i++)
        {
            if(input[i]!=0)
            {
                input[insert]=input[i];
                insert++;
            }

        }

        while(insert<input.length)
        {
            input[insert++]=0;
        }

        Arrays.stream(input).forEach(n->System.out.println(n));
    }
}
