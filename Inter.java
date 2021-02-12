interface Phase1
{
    int a=23;
    void show();
}
interface Phase2 extends Phase1
{
    int b=53;
    void display();
}
interface Phase3
{
    int c=143;
}
class Interface implements Phase2,Phase3
{
        public void display()
        {
            System.out.println("This method belongs to Phase 1");
        }
        public void show()
        {
            System.out.println("This method belongs to Phase 2");
        }    
}
class Inter
{
    public static void main(String args[])
        {
            Interface A=new Interface();
            A.display();
            A.show();
            System.out.println("A = "+A.a+"\nB = "+A.b+"\nC = "+A.c);
        }
}