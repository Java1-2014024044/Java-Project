package java_0509;

public class Lion extends Animal {
	private int legs=4;
	void roar() {
		//weight쓸려면 부모클래스의 private를 protect로 바꾸면된다//
		weight = 80;
		System.out.println("fly()가 호출되엇음" + weight);
	}
	void setPicture(String s){
		picture = s;
		System.out.println(s); // s또는 picture로 animaltest에서 글자따오는거 // 
	}

}
