class Reuse{
static void combination(int[] a,int index,int tar,String p){
if(tar==0){
System.out.println(p);
return;
}
if(index==a.length||a[index]>tar)
return;
combination(a,index+1,tar-a[index],p+a[index]+" ");
combination(a,index+1,tar,p);
}
public static void main(String[] args)
{
int [] a={2,3,6,8,4,1};
int tar=8;
combination(a,0,tar," ");
}
}