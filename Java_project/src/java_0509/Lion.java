package java_0509;

public class Lion extends Animal {
	private int legs=4;
	void roar() {
		//weight������ �θ�Ŭ������ private�� protect�� �ٲٸ�ȴ�//
		weight = 80;
		System.out.println("fly()�� ȣ��Ǿ���" + weight);
	}
	void setPicture(String s){
		picture = s;
		System.out.println(s); // s�Ǵ� picture�� animaltest���� ���ڵ����°� // 
	}

}
