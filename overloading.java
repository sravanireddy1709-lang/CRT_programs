package cse;
class test {
   int add(int a,int b)
 {
	 return a+b;
 }
   int add(int a,int b,int c)
   {
	   return a+b+c;
   }
}
public class overloading
{
	public static void main(String[] args)
	{
		 test t=new test();

		 System.out.println(t.add(2, 3));
		 System.out.println(t.add(2, 3, 5));	
    }	
}
