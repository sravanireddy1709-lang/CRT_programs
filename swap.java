package cse;
public class swap {
 public static void main(String[] args)
 {
	 int num[]= {12,15};
	 System.out.println("before");
	 System.out.println("first" +num[0]);
	 System.out.println("second" +num[1]);
	 int temp=num[0];
	 num[0]=num[1];
	 num[1]=temp;
	 System.out.println("after");
	 System.out.println("first" +num[0]);
	 System.out.println("second" +num[1]);
 }
}
