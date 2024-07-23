package LinkedInPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineWordsCharactersInFile {

    public static void main(String args[])  {
        BufferedReader reader = null;

        //Initializing the count of each variable to zero
        int charCount=0;
        int wordCount=0;
        int lineCount=0;

        try{

            reader = new BufferedReader(new FileReader("C:\\Users\\HKorada\\Documents\\SeleniumAndPrograms.docx"));

            //Reading the first line into currentLine variable
            String currentLine=reader.readLine();

            while(currentLine !=null)
            {
                //line count updated
                lineCount++;

                //Getting word count
                String[] words =currentLine.split(" ");

                wordCount=wordCount+words.length;

                //Getting character count

                for(String word: words)
                {
                    charCount=charCount+word.length();
                }

                //Reading the next line into currentLine variable
                currentLine =reader.readLine();
            }

            System.out.println("Total number of lines "+lineCount);
            System.out.println("Total number of Words "+wordCount);
            System.out.println("Total number of Characters "+charCount);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {

            try {
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}
