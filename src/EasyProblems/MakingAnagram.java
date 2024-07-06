package EasyProblems;

public class MakingAnagram {

    //https://www.hackerrank.com/challenges/making-anagrams/problem
    public static void main(String args[])
    {

        makeAnagram("abcfwrttds","fwrttdsfjjk");
    }

    public  static int makeAnagram(String word1,String word2)
    {
      int[] c = new int[26];

      for(int i=0;i<word1.length();i++)
      {
          c[word1.charAt(i) - 'a']++;
      }

      //For second decrement value for each character with 1
        for (int j=0;j<word2.length();j++)
        {
            c[word2.charAt(j) - 'a']--;
        }

        //Loop through the Integer array and capture the -1 and 1 values which are unique to word1 and word2 , and do abs value to get the sum
        int total=0;
        for(int k:c)
        {
            total=total+Math.abs(k);
        }
        System.out.println(total);
        return total;
    }
}


