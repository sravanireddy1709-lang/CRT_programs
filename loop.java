package cse;

public class loop {

	public static void main(String[]args)
	{
		int i,j,k;
		j=0;
		k=0;
		for(i =10;i>=0;i--)
		{
			System.out.println(i);
			while(j<5)
			{
				System.out.println(j);
				j=j+1;
			}
			do
			{
				System.out.println(k);
				k=k+1;
			}
			while(k<=5);
		}
		
	}
}
