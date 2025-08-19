package cse;
import java.util.Arrays;
public class reverse {
    public static void main(String[] args)
    {
    	int arr[]= {1,2,3,4,5};
    	int []copy=Arrays.copyOf(arr, arr.length);
    	for(int i=0; i<copy.length/2; i++)
    	{
    		int temp=copy[i];
    		copy[i]=copy[copy.length-1-i];
    		copy[copy.length-1-i]=temp;
    		System.out.println(Arrays.toString(copy));
    	}
    }
}
