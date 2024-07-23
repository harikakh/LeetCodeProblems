package LinkedInPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class DuplicateWord {
    public static void main(String args[])
    {
        String s="Big black bug bit a big black dog on his big black nose";
        List<String> dup =findDuplicateWords(s);
        System.out.println(dup);
    }

    public static List<String> findDuplicateWords(String str)
    {

        HashMap<String,Integer> wordList= new HashMap<>();

        String[] strArray= str.split(" ");

        for(int i=0; i< strArray.length;i++)
        {
            if(wordList.containsKey(strArray[i]))
            {
                wordList.put(strArray[i],wordList.get(strArray[i])+1);
            }
            else
            {
                wordList.put(strArray[i],1);
            }
        }
        List<String> dupWord= new ArrayList<>();
        for(Map.Entry<String,Integer> wordL : wordList.entrySet())
        {
            if(wordL.getValue()>1)
            {
                dupWord.add(wordL.getKey());
            }
        }
        return dupWord;
    }
}
