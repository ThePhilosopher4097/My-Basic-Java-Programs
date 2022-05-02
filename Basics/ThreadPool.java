import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class RunnablePool implements Runnable{
    
    public String JobName;
    public RunnablePool(String name){
        JobName = name;
    }
    public void run(){
        System.out.println("Execution of job no."+Thread.currentThread().getId()+" Started by "+JobName);
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println("Execution of job no."+Thread.currentThread().getId()+" stopped by "+JobName);
    }
}

public class ThreadPool {
    public static void main(String args[]){

        ExecutorService Painters = Executors.newFixedThreadPool(5);    // ExecutorService interface
        ExecutorService Electricians = Executors.newFixedThreadPool(4);
        ExecutorService Plumbers = Executors.newFixedThreadPool(3);
        
        for(int i=1;i<=20;i++){
            Runnable R1 = new RunnablePool("Painter for Flat no "+i);
            Painters.execute(R1);
            Runnable R2 = new RunnablePool("Electrician for Flat no "+i);
            Electricians.execute(R2);
            Runnable R3 = new RunnablePool("Plumber for Flat no "+i);
            Plumbers.execute(R3);
        }
        Painters.shutdown();
        Electricians.shutdown();
        Plumbers.shutdown();
    }    
}
