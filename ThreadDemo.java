import java.util.Scanner;
class ThreadDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Thread t=Thread.currentThread();
        System.out.println("Current Name : "+t);
        System.out.println("Enter new name : ");
        t.setName(sc.nextLine());
        System.out.println("Updated Name : "+t);
        System.out.print("Enter Priority : ");
        t.setPriority(sc.nextInt());
        System.out.println("Updated Name : "+t);
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : "+e);
        }
    }
}