class StringClass
{
    public static void main(String args[])
    {
        char array[]={'j','a','i'}; 
        String str1=new String(array);
        String str2="Shivaji";
        String str3=str1+" "+str2;
        String str4=new String(str3.toUpperCase());
        String str5="Afzal";
        System.out.println("String str1 = "+str1+"\nString str2 = "+str2+"\nString str3 = "+str3+"\nString str3 = "+str4);
        System.out.println("str4==str3 ? "+str4.equals(str3));
        System.out.println("str4==str3 (Ignore Case) ? "+str4.equalsIgnoreCase(str3));
        if(str2.compareTo(str5)>0)  System.out.println("Shivaji is greater than Afzal.");
        String S1="tejas anand sawant";
        System.out.println("Tejas's Name earlier : "+S1);
		for(int i=0;i<S1.length();i++)
		{
			if(i==0)	S1=S1.substring(0,1).toUpperCase()+S1.substring(1);
			if(S1.charAt(i)==' ')		S1=S1.substring(0,i+1)+S1.substring(i+1,i+2).toUpperCase()+S1.substring(i+2);
		}
		System.out.println("Tejas's Name Now : "+S1);
        String str6=str1.replace('i','y');
        System.out.println("Replacing i with y : "+str6);
        System.out.println("str6.indexOf('g') = "+str6.indexOf('g'));
        System.out.println("Does str1 Starts with J ?  "+str1.startsWith("J"));
        System.out.println("Does str6 Ends with y ?  "+str6.endsWith("y"));
	String k1="DEMO";
	System.out.println("K1 : "+k1);
	String k2="DEMO";
	System.out.println("K2 : "+k2);
	k1="HELLO";
	System.out.println("After Update : \nK1 : "+k1+"\nK2 : "+k2);
    }
}