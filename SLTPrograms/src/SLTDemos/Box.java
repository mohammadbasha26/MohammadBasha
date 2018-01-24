package SLTDemos;

public class Box {
	double width,height,depth;




	public static void main(String arg[])
	{
		Box boxobj=new Box();
		
		boxobj.width=10;
		boxobj.height=15;
		boxobj.depth=50;
		
		double volume;
		volume=boxobj.width*boxobj.height*boxobj.depth;
		
		System.out.println("Volume:"+volume);
	}
}



