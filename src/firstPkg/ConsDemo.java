package firstPkg;

public class ConsDemo 
{

	public ConsDemo(int a)
	{
		System.out.println("this is constructor");
		int b = a*a;
		System.out.println(a);
		
	}
	
	
	public int addition()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
		return a;
		
	}
	

	public void sum(int a, int b)
	{
		
		int c = a+b;
		System.out.println(c);
		
		
	}
	
	public static void main(String[] args) {
		ConsDemo cd = new ConsDemo(20);
		
		
		int x = cd.addition();  //50
		
		cd.sum(x, 40);
		
		
	}
	
}
