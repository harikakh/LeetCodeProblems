package com.net.medium;

import LinkedInPrograms.ThreadsProgramToPrintOddEven;

public class ThreadsPractice  implements Runnable{
    static int count =0;
    Object object ;

    @Override
    public void run() {

        while(count <10)
        {
            if(count%2==0 && Thread.currentThread().getName().equals("even"))
            {
                synchronized (object)
                {
                    System.out.println("Even thread is running "+Thread.currentThread().getName()+"and count is"+count);
                    count++;
                }
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

            if(count%2!=0 && Thread.currentThread().getName().equals("odd"))
            {
                synchronized (object)
                {
                    System.out.println("Odd thread is running"+Thread.currentThread().getName()+"count is "+count);
                    count++;
                }
                object.notify();

            }

        }
    }

    public static void main(String args[])
    {
        Object object  = new Object();
      Runnable run1 = new ThreadsProgramToPrintOddEven(object);
      Runnable run2 = new ThreadsProgramToPrintOddEven(object);

      new Thread(run1,"even").start();
      new Thread(run2,"odd").start();

    }
}
