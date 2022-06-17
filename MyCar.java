package week1.day2;

public class MyCar 
{
	public static void main(String[] args) 
	
	{
		
	Car1 Obj = new Car1();
	System.out.println(Obj.switchOnAc());
	System.out.println(Obj.applyGear());
	String breakStatus = Obj.applyBreak();
	System.out.println(breakStatus);
	Obj.applyAcclerate();
}
}
