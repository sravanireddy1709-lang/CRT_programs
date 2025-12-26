class Tower{
static void Towerofhonioi(int n,char sou,char dest,char help){
if(n==1){
System.out.println("move the 1 from"+sou+"to"+dest);
}
Towerofhonioi(n-1,sou,dest,help);
System.out.println("move the "+n+" from"+sou+"to"+dest);
Towerofhonioi(n-1,sou,dest,help);
}
public static void main(String[] args)
{
int n=3;
Towerofhonioi(n,'A','B','C');
}
}