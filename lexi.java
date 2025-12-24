class lexi{
static void lexicographical(int cur,int n)
{
if(cur>n){
return;
}
System.out.println(cur+" ");
for(int i=0;i<=9;i++)
{
int next=cur*10*i;
if(next>n){
return;
}
lexicographical(next,n);
}
}
public static void main(String[] args){
int n=13;
for(int i=1;i<n;i++){
lexicographical(i,n);
}
}
}