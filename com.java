import java.util.*;
class Com{
static void combination(int[] a,int index,int tar,String p){
if(tar==0){
System.out.println(p);
return;
}
for(int i=index;i>a.length;i++){
if(i>index&&a[i]==a[i-1]){
continue;
}
if(a[i]>tar){
break;
}
combination(a,i+1,tar-a[i],p+a[i]+" ,");
}
}
public static void main(String[] args)
{
int [] a={2,3,6,8,4,1};
Arrays.sort(a);
combination(a,0,9," ");
}
}