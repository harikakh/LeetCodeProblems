package EasyProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

//https://www.hackerrank.com/challenges/equal-stacks/problem

public class EqualStacks {

   public static void main(String args[])
   {
       Stack<Integer> s1 = new Stack<>();
       Stack<Integer> s2 = new Stack<>();
       Stack<Integer> s3 = new Stack<>();

       int[] h1={3, 2, 1, 1, 1};
       int[] h2={4,3,2};
       int[] h3={1, 1, 4, 1};

       s1 =fillTheStack(h1);
       s2=fillTheStack(h2);
       s3=fillTheStack(h3);

int maxHt =0;

       while(!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty())
       {

           int s1ht =s1.peek();
           int s2ht= s2.peek();
           int s3ht=s3.peek();

           if(s1ht == s2ht && s1ht == s3ht)
           {
                maxHt=s1ht;
                break;
           }

         if(s1ht >=s2ht && s1ht>=s3ht)
         {
             s1.pop();

           }
         else if (s2ht>s1ht && s2ht>=s3ht)
         {
             s2.pop();
         }

         else if(s3ht>s1ht && s3ht>=s2ht)
         {
             s3.pop();
         }


       }

       System.out.println(maxHt);
   }

   public static Stack<Integer> fillTheStack(int[] nums)
   {
       Stack<Integer> output = new Stack<>();

       int count=0;
       for(int i=nums.length-1;i>=0;i--)
       {
           count=count+nums[i];
           output.push(count);
       }
       System.out.println(output);
       return output;
   }
}
