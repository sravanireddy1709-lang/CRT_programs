package cse;
public class bubble {
 static void sort()
 {
	 int arr[]= {2,8,6,9,2,3};
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 for(int j=0;j<arr.length-1;j++)
		 {
			 if(arr[j]>arr[j+1])
			 {
				 int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		 }
	 }
	 for(int num:arr)
	 {
		 System.out.println(num);
	 }
 }
 public static void main(String[] args)
 {
	 sort();
 }
}
