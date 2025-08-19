package cse;
import java.util.Arrays;
public class frequency {
    public static void main(String[] args)
    {
    	int arr[]= {4,2,2,8,4,4,9};
    	Arrays.sort(arr);
    	int count=1;
    	for(int i=1;i<arr.length;i++)
    	{
    		if(arr[i]==arr[i-1])
    		{
    			count++;
    		}
    		else
    		{
    			System.out.println(arr[i-1]+"occurs"+count+"times");
    			count=1;
    		}
    	}
    	System.out.println(arr[arr.length-1]+"occurs"+count+"times");
    }
}
