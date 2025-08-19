package cse;
import java.util.Arrays;
class binarySearch {
	public static void main(String[] args)
	{
		int arr[]= {1,4,3,0,7};
		int key=5;
		Arrays.sort(arr);
		int index=Arrays.binarySearch(arr, key);
		if(index>=0)
		{
			System.out.println(key+"found at index"+index);
		}
		else
		{
			System.out.println(key+"not found");
		}
	}

}
