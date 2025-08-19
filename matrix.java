
import java.util.Scanner;
public class matrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k,r,c;
		System.out.println("enter the rows:");
		r=sc.nextInt();
		System.out.println("enter the columns:");
		c=sc.nextInt();
		int[][]a=new int[r][c];
		int[][]b=new int[r][c];
		int[][]result=new int[r][c];
		for(i=0;i < r;i++) {
			for(j=0;j < c;j++) {
				System.out.println("enter the["+i+"]["+j+"] a matrix:");
				a[i][j]=sc.nextInt();
			}

		}
		for(i=0;i < r;i++) {
			for(j=0;j < c;j++) {
				System.out.println("enter the["+i+"]["+j+"] b matrix:");
				b[i][j]=sc.nextInt();
			}

		}
		for(i=0;i < r;i++) {
			for(j=0;j < c;j++) {
				for(k=0;k <c;k++) {
					result[i][j]+=a[i][k]*b[k][j];
				}
				System.out.println(result[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
