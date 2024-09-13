package oopsConcepts;

public class T1CallAbsClass extends AbsClassDemo
{

	
	public void m2()
	{
		System.out.println("here is my credential");
		
	}

	public static void main(String[] args)
	{
	
		T1CallAbsClass t1 = new T1CallAbsClass();
		t1.m1();
		t1.m2();
		
	}
	
	
}
