class MyThread extends Thread{
    public void run(){
        Thread.currentThread().setName("Child_Thread");
        System.out.println("\nChild Thread Name : "+Thread.currentThread().getName()+"\tID - "+Thread.currentThread().getId()+"\tPriority - "+Thread.currentThread().getPriority()+"\n");
        Thread.yield();
        for (int i=1;i<=10;i++){
            System.out.println("Child Thread "+i);
        }
    }
}

public class ThreadInfo {
    public static void main(String[] args) throws InterruptedException{

        Thread.currentThread().setPriority(4);      // 1 to 10 (lowest to highest)
        Thread.currentThread().setName("Main_Thread");

        System.out.println("Main Thread Name : "+Thread.currentThread().getName()+"\tID - "+Thread.currentThread().getId()+"\tPriority - "+Thread.currentThread().getPriority()+"\n");
        MyThread T1 = new MyThread();
        T1.setPriority(8);
        T1.start();
        //Thread.yield();                       // Main thread had given hold to T1
        //Thread.currentThread().sleep(2);      // sleep for 2 millisecond
        
        try{
            T1.join();                          // Main thread should wait until execution of T1
        }catch(InterruptedException e){}        // Hence, despite child thread has yeilded still main had to until child execution

        for (int i=1;i<=10;i++){
            System.out.println("Main Thread "+i);
        }    
    }
}

