package cse;

import java.util.Scanner;

public class Bank1 
{
	public static void main(String[] args)
	{
	int corr_pass=2004;
	
	Scanner sc=new Scanner(System.in);
	int Balance=100;
	for(int i=1;i<4;i++)
	{
		System.out.println("PLease Enter your  4 digit Password to entering :");
		int new_pass=sc.nextInt();
		if(corr_pass == new_pass)
	{
			System.out.println("Welcome to inside ATM !!");	
			while(true)
			{
			
			System.out.println("choose option u need to want!!");
			System.out.println("Balance :1");
			System.out.println("Deposit :2");
			System.out.println("Withdraw :3");
			System.out.println("Exit :4");
			System.out.println("choose one option !!");
			
			int Deposit,withdraw;
			int option= sc.nextInt();
			switch(option) 
			{
			case 1:
				System.out.println("Balance money: "+Balance);
				break;
			case 2:
				System.out.println("enter deposit money: ");
			    Deposit= sc.nextInt();
				Balance=Balance+Deposit;
				break;
			case 3:
				System.out.println("enter withdraw  money: ");
				withdraw= sc.nextInt();
				if(Balance>=withdraw) {
				Balance-=withdraw;	
				}
				else 
				{
					System.out.println("Insufficient balance!!");
				}
				
				break;
			case 4:
				System.out.println("thank you visit again");
				break;
			 default:
				 System.out.println("choose correct one:");
				 break;
			 
			}
			if(option==4) {
				break;
			}
			}
			break;
		}		
		else 
		{
		     if(i!=3)
		     {
		    	 System.out.println("!! sorry Incorrect !!:"+i);
		     }
			else 
			{
				System.out.print("!! sorry Try After 24 Hours!!");
		    }
		}
    }
  }
}


