package sample_0404;

public class Television {
	int channel; // ���� // 
	int volume;
	boolean onOff;
	
	Television(int c,int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("ä���� " + channel + "�̰� ������" + volume + "�Դϴ�.");
	}
}
