package cse;

 class animals {
 void food()
 {
	 System.out.println("animals eat food");
 }
}
 class dog extends animals
{
	void food()
	{
		System.out.println("dog barks");
	}
}
public class overriding
{
	public static void main(String[]args)
	{
	animals f=new dog();
		f.food();
	}
}
