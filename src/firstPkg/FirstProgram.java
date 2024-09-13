package firstPkg;

public class FirstProgram 
{
	int a = 20;
	float b = 20.5f;
	char c = 'X';
	boolean d = false;
	String e = "Java";
	
	public void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	public static void main(String[] args)
	{
		FirstProgram fp = new FirstProgram();
		fp.printvalues();
		System.out.println(fp.a);
		
	}
	
}
