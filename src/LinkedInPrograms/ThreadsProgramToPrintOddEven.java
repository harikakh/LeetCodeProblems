package LinkedInPrograms;

public class ThreadsProgramToPrintOddEven implements Runnable {

static int count=1;
Object object;

public ThreadsProgramToPrintOddEven(Object object)
{
    this.object=object;
}

    @Override
    public void run() {

        while(count<=100)
        {

            if(count%2==0 && Thread.currentThread().getName().equals("even")){
                synchronized (object){
                    System.out.println("Thread name: "+Thread.currentThread().getName()+ "value "+count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            if(count%2!=0 && Thread.currentThread().getName().equals("odd"))
            {
                synchronized (object)
                {
                    System.out.println("Thread name: "+Thread.currentThread().getName()+ "value is : "+count);
                    count++;
                    object.notify();
                }
            }
        }

    }

    public static void main(String[] args)
    {
        Object object = new Object();
        Runnable run1 =new  ThreadsProgramToPrintOddEven(object);
        Runnable run2= new ThreadsProgramToPrintOddEven(object);

        new Thread(run1,"even").start();
        new Thread(run2,"odd").start();


    }
}
