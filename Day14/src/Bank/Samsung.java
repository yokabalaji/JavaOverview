package Bank;

public class Samsung implements SmartPhone {
	public void videoCall() {
		System.out.println("on video call");
	}
	public void voiceCall() {
		System.out.println("on voice call");
	}
	public void connectivity() {
		System.out.println("connecting someone");
	}
	public void cameraFunction(String tapOnScreen) {
//	String tapOnScreen1="Single tap";
	switch(tapOnScreen) {
	case "Single tap":
		System.out.println("taking pic");
		break;
	case "double tap":
		System.out.println("zoom");
		break;
	case "Continue tap":
		System.out.println("continue shots");
	}
	
	}
}
