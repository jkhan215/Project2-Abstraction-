package abstraction;

public class TestVR {

	public static void main(String[] args) {
		
	Tablet tablet = new VR ();
	tablet.screensize();
	tablet.powertime();
	
	Computer computer = new VR ();
	computer.speed ();
	computer.sleeptime();
	
	VR vr = new VR ();
	vr.home();

	}

}
