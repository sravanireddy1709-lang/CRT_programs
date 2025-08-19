package cse;
import java.util.Arrays;
public class sorts {
   public static void main(String[]args)
   {
	   int arr[]= {10,20,30,45,40};
	   System.out.println(Arrays.toString(arr));
	   arr=Arrays.copyOf(arr, 10);
	   System.out.println("resize" +Arrays.toString(arr));
	   int marks[]= {45,88,50,75,100};
	   Arrays.sort(marks);
	   System.out.println("marks" +Arrays.toString(marks));
	   int num[]= {23,56,78,10,15};
	   Arrays.sort(num);
	   int second=num[num.length-2];
	   System.out.println("second" +second);
   }
}

