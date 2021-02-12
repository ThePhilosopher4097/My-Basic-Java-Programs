//Check for Mountain
class Mountain{
	public static void main(String args[]){
		int a[]={0,1,2,2,4,5,4,3,2,1,0};
		boolean flag=true;
		int small=a[0],index=0;
		for(int i=1;i<a.length;i++){
			if(small<a[i]){
				small=a[i];	index=i;
			}
		}
		for(int i=index;i>0;i--){
			if(a[i]-a[i-1]!=1){
				flag=false;
				System.out.println("The Entered is NOT a Mountain Array !");
				break;
			}
		}
		for(int i=index;i<a.length-1;i++){
			if(a[i]-a[i+1]!=1){
				flag=false;
				System.out.println("The Entered is NOT a Mountain Array !");
				break;
			}
		}
		if(flag==true){
			System.out.println("The Entered is a Mountain Array !");
		}
		int b[]={1,3,6,7,7,9,8,0};
		for(int j:b)	System.out.println(j);
	}
}