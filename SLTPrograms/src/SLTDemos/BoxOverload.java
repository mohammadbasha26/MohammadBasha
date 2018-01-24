package SLTDemos;

public class BoxOverload {
	
		double width,height,depth;
		
		public BoxOverload() //Default Box
		{
			width=10;
			height=15;
			depth=20;
		}
		
		public BoxOverload(double val) //Square Box
		{
			width=height=depth=(val>0)?val:1;
		}
		 
		public BoxOverload(double w,double h,double d) //User Defined
		{
			width=(w>0)?w:1;
			height=(h>0)?h:1;
			depth=(d>0)?d:1;
		}
	}


