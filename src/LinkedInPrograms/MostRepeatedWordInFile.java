package LinkedInPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWordInFile {
    
    public static void main(String args[])
    {
        readFile();
    }
    
    public static void readFile()
    {
        int count=0;
        String mostRepeatedWord="";
        BufferedReader bufferedReader=null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HKorada\\Documents\\File.docx"));

            String currentLine=bufferedReader.readLine();
            HashMap<String,Integer> wordMap= new HashMap<>();
            while(currentLine !=null) {
                String[] words = currentLine.split(" ");


                for (String word : words) {
                    if (wordMap.containsKey(word)) {
                        wordMap.put(word, wordMap.get(word) + 1);
                    } else {
                        wordMap.put(word, 1);
                    }

                }

                currentLine = bufferedReader.readLine();
            }

            for(Map.Entry<String,Integer> map: wordMap.entrySet())
            {
                if(map.getValue()>count)
                {
                    mostRepeatedWord=map.getKey();
                    count=map.getValue();
                }
            }

            System.out.println("Most repeated word is "+mostRepeatedWord);
            System.out.println("Count is "+count);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

        }
    }
}
