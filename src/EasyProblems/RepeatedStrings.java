package EasyProblems;

public class RepeatedStrings {

    //https://www.hackerrank.com/challenges/repeated-string/problem

    public static void main(String args[])
    {

        findRepeatedCharacters("abcac", 122L);
    }

    public static void findRepeatedCharacters(String value, Long k)
    {
        int strLen=value.length();


        //In the string find how many times 'a' is found
        long acount=value.chars().filter(c->c=='a').count();


        //In K length how many times the complete string occurs
        long comLength=k/strLen;

        //Find how many are left out of the k

        long remaining =k-(comLength*strLen);

        //In remaining letters how many times 'a' appears

       value= value.substring(0, (int) remaining);

        long remainingCount=value.chars().filter(c->c=='a').count();

        long totalCount=(comLength*acount)+remainingCount;

        System.out.println(totalCount);

    }
}
