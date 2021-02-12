class ExceptionHandling
{   
    static void meth1()
    {
        try
        {
            throw new NullPointerException("Nothing");
        }
        catch(NullPointerException ne)
        {
            System.out.println("Exception : "+ne);
            
        }
        throw new NullPointerException("Nothing");
    }
    public static void main(String args[])
    {
        int a=1,b=0,x[]={1,2};
        try
        {
            System.out.println("A / B = "+(a/b));
        }   
        catch(ArithmeticException ae)
        {
            System.out.println("Exception Divide by Zero : "+ae);
        }   
        catch(Exception e)
        {
            System.out.println("Exception Occured : "+e);
        }
        finally
        {
            System.out.println("Finally Block of First Try.");
        }
        try
        {
            x[2]=0;
        }   
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Exception Array Index limit Violation : "+ae);
        }  
        finally
        {
            System.out.println("Finally Block of Second Try.");
        }
        try
        {
            meth1();
        }
        catch(Exception e)
        {
            System.out.println("Recaught : "+e);
        }
    }
}