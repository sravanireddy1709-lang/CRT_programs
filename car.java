package cse;
interface car
{
	void engine();
	void gears();
}
  class bmw implements car
{
	public void engine()
	{
	System.out.println("engine");
	System.out.println("power:1000");
	System.out.println("torque");
	}
	public void gears()
	{
		System.out.println("automatic");
	}
}
 class abstraction
 {
	 public static void main(String[]args)
	 {
		 bmw b1=new bmw();
		 b1.engine(); 
	 }
 }
 