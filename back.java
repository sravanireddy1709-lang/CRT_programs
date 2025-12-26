class Back{
static void Subset(int[] a,int index,int sum,int tar,String p){
if(sum==tar){
System.out.println(p);
return;
}
if(index==a.length||sum>tar)
return;
Subset(a,index+1,sum+a[index],tar,p+a[index]+" ");
Subset(a,index+1,sum,tar,p);
}
public static void main(String[] args)
{
int [] a={2,3,6,8,4,1};
int tar=8;
Subset(a,0,0,tar," ");
}
}