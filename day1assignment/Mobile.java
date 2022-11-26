package week1.day1assignment;

public class Mobile {
	
	public void makeCall() {
		
		String mobileModel = "OPPO A15";
		float mobileWeight = 175f;
		
		System.out.println(mobileModel);
		System.out.println(mobileWeight);

	}
	
	public void sendMsg() {
		
		boolean fullCharged = true;
		int mobileCost = 15000;
		
		System.out.println(fullCharged);
		System.out.println(mobileCost);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile action = new Mobile();
		action.makeCall();
		action.sendMsg();
		System.out.println("This is my phone");
		
	}

}
