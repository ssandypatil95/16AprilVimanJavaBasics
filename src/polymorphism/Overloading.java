package polymorphism;

public class Overloading {
	
	
	public void m1(int i, String s)
	{
		System.out.println("two argument method");
	}
	
	public void m1(String s, int i)
	{
		System.out.println("two argument method");
	}
	
	public void m1(int o)
	{
		System.out.println("one argument method");
	}
	
	
	public static void m1(String s)
	{
		System.out.println("static method with one argument");
	}
	
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		
		o.m1(56);
		
		o.m1(78, "abc");
		
		m1("def");
	}


}
