package LinkedInPrograms;

public class PrintOddEvenUsingTwoThreads implements  Runnable{
   private int max;
   private Printer printer;
   private boolean isEvenNumber;


    @Override
    public void run() {

        int number = isEvenNumber ?2 :1;

        while (number <=max)
        {
            if(isEvenNumber)
            {

            }
        }
    }


}

class Printer
{
    private  volatile boolean isOdd;


}