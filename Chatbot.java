import java.util.Scanner;
class Chatbot
{
    static String reply="";
    static String str[]=new String[50];
    static void content(String s)
    {   int i,k=0,j=0;
        for(i=0;i<s.length();i++)
        {
            if(i==0)
            {
                k=i;
            }
            else if(s.charAt(i)==' ')
            {   
                str[j++]=s.substring(k,i);
                k=i+1;
            }
            if(i==s.length()-1)
            {
                str[j++]=s.substring(k,i+1);
            }
        }
    } 
    static String chat(String s)
    {
        if(s.startsWith("what")==true)  reply="I don't know..";
        else if(s.endsWith("is your name ?")) reply="my name is Dranzer !!";
        else if(s.startsWith("how")==true) 
        { 
            content(s);    
            for(int i=0;i<s.length();i++)
            {   
                reply="actually...";
            }
        }
        else if(s.startsWith("why")==true) reply="because...";

        return reply;
    }

    public static void main(String args[])
    {
        String input;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("Sam : ");
            input=sc.nextLine();
            if(input.equals("EXIT")==true) break;
            reply=chat(input);
            System.out.println("Bot : "+reply); reply="";
            //System.out.println();
        }while(true);
    }
}