package EasyProblems;

public class LengthOfLastWord {

    public static void main(String  args[])
    {
        String wordsList="Hello World";
        String[] words=wordsList.split(" ");

     int lengthOfLastWord= words[words.length-1].length();
        System.out.println(lengthOfLastWord);


    }

    public static int lengthOfLastWord(String s)
    {
        int count=0;

        for(int i=s.length();i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
            else
            {
                //this means we have already found the last word length
                if(count>0)
                    return count;
            }
        }

       return count;
    }
}
