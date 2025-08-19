package cse;
import java.util.*;
public class Bank {

	public static void main(String[] args) {
		int n=3;
		Scanner sc=new Scanner(System.in);
		int corr_pass=2004;
		System.out.println("PLease Enter your  4 digit Password to entering :");
		int new_pass=sc.nextInt();
				
			if(new_pass == corr_pass)
			{
				System.out.println("Welcome to inside ATM !!");	
				System.out.println("choose option u need to want!!");
				System.out.println("Balance :B");
				System.out.println("Receipt :R");
				System.out.println("Withdraw :w");
				System.out.println("Exit :e");


			}
			
			else if(new_pass != corr_pass)
			   {
				System.out.println("!! sorry Incorrect !! Please enter correct password !!");
				for(int i=1;i<3;i++) 
				{
				System.out.println("PLease Enter your password to entering :");
				 new_pass=sc.nextInt();
				 if(new_pass == corr_pass)
					{
						System.out.println("Welcome to inside ATM !!");	
						System.out.println(" choose option u need to want!!");
						System.out.println("Balance :B");
						System.out.println("Receipt :R");
						System.out.println("Withdraw :w");
						break;

					}
				 else {
					 if(i>3)
					 {
				    
						System.out.print("!! sorry Try After 24 Hours!!");
					}
					 
				 }
			   }
				 
		 }		
			
	}

}
