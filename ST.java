class ST{
    public static void main(String args[]){   
        int a=0,b=1,c=0,sp=5;
        for(int i=0;i<4;i++){
            for(int k=sp;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                a=b;b=c;c=a+b;
                System.out.print(c+" ");
            }
            System.out.println();
            sp--;
        }
    }
}