package SLTDemos;

public class SubClass extends SuperClass
	{
		public SubClass()
		{
			System.out.println("Default Constructor of SubClass");
		}
		
		public SubClass(int i)
		{
			System.out.println("Overloaded Constructor of SubClass");
		}
		
		public static void main(String arg[])
		{
			SubClass obj1=new SubClass();
			
			SubClass obj2=new SubClass(11);
		}
	}

