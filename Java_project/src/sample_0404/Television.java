package sample_0404;

public class Television {
	int channel; // 질문 // 
	int volume;
	boolean onOff;
	
	Television(int c,int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은" + volume + "입니다.");
	}
}
