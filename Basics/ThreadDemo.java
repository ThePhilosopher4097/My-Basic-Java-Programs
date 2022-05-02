class MyThread extends Thread{
    static volatile boolean exit = false;
    public void start(){
        super.start();
    }
    public void run(){
        System.out.println("@Rohit Sharma comes to Bat");
        for(int i=1;i<=60;i+=6){
            System.out.println("@Rohit Sharma (hits a six) ----> "+i);
        }
        exit = true;
        System.out.println("@Rohit Sharma OUT (clean bold)");
    }
}

class MyThread2 extends MyThread{
    static volatile boolean exit = false;
    public void start(){
        System.out.println("@Ravindra Jadeja comes to Bat");
        super.start();
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("@Ravindra Jadeja (takes a single) ----> "+i);
        }
        exit = true;
        System.out.println("@Ravindra Jadeja OUT (Catch out)");
    }
}

class RunnableClass implements Runnable{
    
    public void run(){
        System.out.println("@MS Dhoni comes to Bat");
        for(int i=1;i<=91;i+=6){
            System.out.println("@MS Dhoni (hits a six!) ----> "+i);
        }
        System.out.println("@MS Dhoni Finishes off in style !!!");
    }
}

public class ThreadDemo {
    public static void main(String args[]){
        System.out.println("Welcome to thread demo program !");
        MyThread T1 = new MyThread();
        MyThread2 T2 = new MyThread2();
        RunnableClass R1 = new RunnableClass();
        T1.start();     // runs and execute run method
        T2.start();     // runs and execute run method
        Thread T3 = new Thread(R1); // runnable thread
        Thread T4 = new Thread();   // empty thread
        T3.start();     // thread created and executes the run method 
        T4.start();     // nothing
        T3.run();       // execute the run method but thread not created
        T4.run();       // nothing
        //R1.start();   // error
        System.out.println("@Virat Kohli comes to Bat");
        for(int i=1;i<=40;i+=4){
            System.out.println("@Virat Kohli (hits a four) ----> "+i);
        }
        System.out.println("@Virat Kohli OUT (LBW) ----> ");
    }
}
