class MyThreadNew extends Thread
{
    MyThreadNew()
    {
        super("Using Thread class...");
        System.out.println("Child thread: "+ this);
        start();
    }
    public void run()
    {
        try
        {
            for(int i = 5; i>0; i--)
            {
                System.out.println("Child thread: "+ i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){}
        System.out.println("Exiting child thread...");
    }
}

public class TestMyThread {
    public static void main(String[] args) {
        new MyThreadNew();
        try
        {
            for(int k = 5; k>0; k--)
            {
                System.out.println("Running main thread: "+k);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){}
        System.out.println("Exiting main thread...");
    }
}
