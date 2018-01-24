package SLTDemos;

public class SuperClassA 
{
	public SuperClassA() //Default Constructor
	{
		System.out.println("Super Class Default Constructor");
	}
	
	public SuperClassA(int i) //Overloaded Constructor
	{
		System.out.println("Super Class Overloaded Constructor");
	}
}

public class SubClassA extends SuperClassA 
{
	public SubClassA()
	{
		System.out.println("Default Constructor of SubClass");
	}
	
	public SubClassA(int i)
	{
		super(i);
		System.out.println("Overloaded Constructor of SubClass");
	}
	
	public static void main(String arg[])
	{
		//SubClass obj1=new SubClass();
		
		SubClassA obj2=new SubClassA(11);
	}
}



