package week1.day2;

public class CarClass 
{
	
	public static void main(String[] args) 
	{
		CarClass Obj = new CarClass();
		
		System.out.println(Obj.switchOnAc());
		System.out.println(Obj.applyGear());
		
		String breakStatus = Obj.applyBreak();
		System.out.println(breakStatus);
		
		Obj.applyAcclerate();
		
	}
	
		public String applyBreak() 
		{
			return "Applied Break";
		}
		public String applyGear() 
		{
			return "Applied Gear";
		}
		public boolean switchOnAc() 
		{
			return true;
		}
		public void applyAcclerate() {
			System.out.println("Accelreated");
		}


}
