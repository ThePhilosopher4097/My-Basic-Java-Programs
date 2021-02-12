class MyException  extends Exception
{
    String n;
    MyException(String S)
    {   n=S;
    }
    public String toString()
    {
        return "Hi this is "+n+" Exception !";
    }
}
class CmdExp
{
    static void meth(String array[]) throws MyException
    {
        try{
            array[4]="9";
            throw new MyException("Demo");
        }
        finally{
            System.out.println("This is Finally of meth() method.");
        }
    } 
    public static void main(String args[])
    {
        try{
            int a=13,b=a/args.length;
            meth(args);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Command Line Error : "+ae);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Command Line Error : "+ae);
        }
        catch(MyException me)
        {
            System.out.println("My Exception Thrown : "+me);
        }
    }
}