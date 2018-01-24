package SLTDemos;

public class AdditionOverload {
	public int add(int v1,int v2)
	{
		return v1+v2;
	}
	public double add(double v1,double v2)
	{
		return v1+v2;
	}
	public int add(int v1,int v2,int v3)
	{
		return v1+v2+v3;
	}
	
	public static void main(String arg[])
	{
		AdditionOverload obj=new AdditionOverload();
		
		System.out.println("Two Integer Addition:"+obj.add(10, 20));
		System.out.println("Two Double Addition:"+obj.add(10.3,8));
		System.out.println("Three Integer Addition:"+obj.add(10,20,30));
	}
}


