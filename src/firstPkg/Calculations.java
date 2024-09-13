package firstPkg;

 public class Calculations 
{

	 int a = 40;  //global variable
	 int b = 60;
	 
	
	 
	 public Calculations(int a, int b)
	 {
		 
		 int c = a+b;
		 System.out.println("Constructor sum: " + c);
	 }
	 
	 public Calculations(int a, float b)
	 {
		 float c = a+b;
		 System.out.println("Constructor sum: " + c);
	 }
	 
	
	
	 public float sum()
	{	
		final int a = 20;  //local variable
		//a = 70;
		float b = 30.5f;
		float c = a+b;
		System.out.println(c);
		return c;
	}
	 
	 public float addition(int a, float b)
	 {
		 float c = a+b;
		 System.out.println(c);
		return c;
	 }
	
	 public void sub()
	{
		int c = a-b;
		System.out.println(c);
		
	}
	 
	 
	 public int printval()
	 {
		 String x = "java";
		 int a = 20;
		 return a;
	 }
	
	public static void main(String[] args)
	{
		Calculations abc = new Calculations(30, 30.5f);  //constructor will be automatically called
		
		
		float y = abc.sum();
		
		abc.sub();
		
		float x = abc.addition(30, 40);
		
		abc.addition(50, 60.6f);
		abc.addition(30, y);
		
		
		int z = abc.printval();
		abc.addition(z, 30.5f);
		
		
		
	}
	
	
	
	
	
	
	
}