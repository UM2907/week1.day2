package week1.day2;

public class TwoWheeler {
	
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=15062022L;
	boolean isPunctured=false;
	String bikeName="Bajaj";
	double runningKM=123456.7890123;
	
public static void main(String[] args) {
		
		TwoWheeler Obj=new TwoWheeler();
				
		System.out.println(Obj.noOfWheels);
		System.out.println(Obj.noOfMirrors);
		System.out.println(Obj.chassisNumber);
		System.out.println(Obj.isPunctured);
		System.out.println(Obj.bikeName);
		System.out.println(Obj.runningKM);
	
}
}
