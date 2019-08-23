package j15.threads;

public class MyRunnable implements Runnable
{

    public void run()
    {
        go();
    }
    
    public void go() {
        
        //*
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }//*/
        
        doMore();
    }
    
    public void doMore() {
        System.out.println("top o' the stack from " + Thread.currentThread().getName() );
    }
    
    
    public static void main(String[] args)
    {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.setName("Mythread1");
        myThread.start(); 
        Thread myThread2 = new Thread(threadJob);
        myThread2.setName("Mythread2");
        myThread2.start();
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("back in main");
    }

}