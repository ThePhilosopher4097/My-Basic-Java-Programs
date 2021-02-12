class NewThread implements Runnable
{
    NewThread()
    {
        Thread t=new Thread(this,"ShortcutSamya");
        System.out.println("Child Thread : "+t);
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Child Thread "+i);
                Thread.sleep(500);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : "+e);
        }
        finally{  System.out.println("Child Thread Terminated.");  }
    }
}
class ThreadDemo2
{
    public static void main(String args[])
    {
        new NewThread();
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Main Thread "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : "+e);
        }
        System.out.println("Main thread Terminated");
    }
}