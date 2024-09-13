package oopsConcepts;

public class QA2 extends QA1
{
	int x = 20;  //global
	
	public void printVal()
	{
		final int x = 30;  //local
		//x = 40;
		System.out.println(x);  //30//40
		System.out.println(this.x);//20
		System.out.println(super.x);
		
		super.sum(30, 40);
	}
	
	
	
	
	public void sum(int a, int b)
	{
		
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
		
	}
	
	public void sub(int a, int b)
	{
		
		int c = a-b;
		System.out.println("sub of a&b: " + c);
		
	}
	
	public static void main(String[] args) {
		
		QA2 q2 = new QA2();
		
		q2.sub(20, 30);
		q2.sum(30, 40);
		q2.printVal();
		
		
	}

	
	public void qa1im() {
	System.out.println("this is method of QA1I");
		
	}
	
	
}
