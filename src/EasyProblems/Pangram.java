package EasyProblems;

public class Pangram {

    //https://www.hackerrank.com/challenges/pangrams/problem

    public static void main(String[] args)
    {
        System.out.println(isPangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    public static String isPangrams(String s)
    {
        s=s.replaceAll(" ","").toLowerCase();
        int[] c= new int[26];
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i) - 'a']++;
        }

        for(int k:c)
        {
            if(k==0)
            {
                return "Not Pangram";
            }
        }

        return "Pangram";
    }
}
