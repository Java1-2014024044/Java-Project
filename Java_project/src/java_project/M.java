package java_project;

public class M {
	int channel;
	int volume;
	boolean onOff;
	
	void pr() {
		if(onOff == false) {
			System.out.println("tv is out");
		}
			System.out.println("채널은 " + " "+ channel +" "+ "음량은 "+ " " + volume);
	}
	void volumeUP() {
		if(onOff == false) {
			System.out.println("tv is out");
		}
		volume+=1;
	}
	void volumeUP(int a) {
		if(onOff == false) {
			System.out.println("tv is out");
		}
		volume+=a;
	}
		
	
		
	}


