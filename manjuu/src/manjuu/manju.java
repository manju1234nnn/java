package manjuu;

import mm.mm;

public class manju {
	String home_name;
	String adress_mm;
	double door_num;
	manju(String a,String b,double  c)
	{
		home_name= a;
		adress_mm= b;
		door_num=c;
	}
	public static void main(String[]args)
	{
		manju d1=new manju("manju","mm",129);
		{
	    	System.out.println(d1.home_name);
	    	System.out.println(d1.adress_mm);
	    	System.out.println(d1.door_num);
	}
	}
	}
