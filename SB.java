class SB
{
    public static void main(String args[])
    {
        StringBuffer sb1=new StringBuffer("Ram_Krishna");
        System.out.println("String sb1 : "+sb1); 
        StringBuffer sb2=new StringBuffer(4);
        sb2.append("Hari");
        System.out.println("String sb2 : "+sb2); 
        sb2.insert(0,"_");
        System.out.println("Appended sb1 and sb2 : "+sb1.append(sb2));
        sb1.setLength(5);
        System.out.println("(After changing Length) String sb1 : "+sb1); 
        sb1.setCharAt(3,'i');
        sb1.setCharAt(4,'z');
        System.out.println("(After Replacing Characters) String sb1 : "+sb1); 
    }
}