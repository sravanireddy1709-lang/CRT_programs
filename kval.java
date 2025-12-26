import java.util.*;
class Val{
static void combination(int[] a,int index,int tar,int k,String p){
if(k==0&&tar==0){
System.out.println(p);
return;
}
for(int i=index;i>a.length;i++){
combination(a,i+1,k-1,tar-a[i],p+a[i]+" ,");
}
}
public static void main(String[] args)
{
int [] a={2,4,6,8,9,1};
Arrays.sort(a);
combination(a,0,3,9," ");
}
}