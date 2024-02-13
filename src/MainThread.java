class MyThread implements Runnable
{
    public void run()
    {
        for(int i = 0; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " is "+ i);
            try 
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e.getMessage());
            }

        }
    }
}

public class MainThread {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        Thread t1 = new Thread(mythread);
        Thread t2 = new Thread(mythread);
        Thread t3 = new Thread(mythread);
        t1.start();
        t2.start();
        t3.start(); 
    }    
}
