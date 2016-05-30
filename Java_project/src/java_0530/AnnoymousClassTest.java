package java_0530;

interface RemoteControl {
	void turnOn();
	void turnOff();
}

public class AnnoymousClassTest {
	public static void main(String[] args){
		RemoteControl ac= new RemoteControl() {
			public void turnOn() {
				System.out.println("TV TrunOn()");
			}
			public void turnOff() {
				System.out.println("TV TrunOff()");
			}
		};
		ac.turnOn();
		ac.turnOff();

	}

}
