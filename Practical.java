class Practical
{
    public static void main(String args[])
    {
        int k=0,j=0,i,l1=0,l2=0,l3=0,i2=0,i3=0;
        String str="This is a irreversible String";
        String str2[]=new String[50];
        for(i=0;i<str.length();i++)
        {
            if(i==0)
            {
                k=i;
            }
            else if(str.charAt(i)==' ')
            {   
                str2[j++]=str.substring(k,i);
                k=i+1;
            }
            if(i==str.length()-1)
            {
                str2[j++]=str.substring(k,i+1);
            }
        }
        l2=l3=str2[1].length();
        for(i=0;i<j;i++)
        {
            l1=str2[i].length();
            if(l2>l1)   {   l2=l1;  i2=i;}
            if(l3<l1)   {   l3=l1;  i3=i;}
        }
        System.out.println("Smallest Word : "+str2[i2]);
        System.out.println("Longest Word : "+str2[i3]);
    }
}