package LinkedInPrograms;

public class ThreadsOddEvenUsingJava8  implements  Runnable{

  static   int count=0;
    Object object;

    ThreadsOddEvenUsingJava8(Object object)
    {
        this.object=object;
    }
    public   void run()
    {


        while(count<=10)
        {
            if(count%2==0 && Thread.currentThread().getName().equals("even"))
            {
                synchronized(object)
                {
                    System.out.println("Thread name is "+Thread.currentThread().getName()+"  value is "+count);
                    count++;

                    try{
                        object.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                }
            }

            if(count%2!=0 && Thread.currentThread().getName().equals("odd"))
            {
                synchronized (object)
                {
                    System.out.println("Thread name is "+Thread.currentThread().getName()+"  value is "+count);
                    count++;

                    object.notify();
                }


            }


        }
    }

    public static void main(String args[])
    {
        Object object = new Object();

        Runnable run1 = new ThreadsOddEvenUsingJava8(object);
        Runnable run2 = new ThreadsOddEvenUsingJava8(object);

        new Thread(run1,"even").start();
        new Thread(run2,"odd").start();
    }
}
