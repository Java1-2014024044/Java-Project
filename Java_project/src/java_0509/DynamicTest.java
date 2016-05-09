package java_0509;

abstract class Animal1 /* 오늘한거중에 animal 있어서 언되는거*/ {
	abstract void sound(); /*{ animal들은 소리가 다양 그니까 sound에서 소리를 다 정의할 필요가 없다.
		System.out.println("Ani");
	}*/
	void eat() {
		System.out.println("ani eat");
	}
}
class Dog extends Animal1 {
	private int d=11;
	@Override // override는  위에서 오버라이드 했다는걸 표시해주는것 실수 방지용이다 이거 하고 위에 sound 지우면 빨간줄뜬다. //
	void sound() {
		System.out.println("Dog" + d);
	}
}
class Cat extends Animal1 {
	private int c=99;
	@Override
	void sound() {
		System.out.println("Cat" + c);
	}
}

public class DynamicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal1 a = new Animal1();
		Animal1 b = new Dog(); // dog와 cat은 animal1로 연동되있다.//
		Animal1 c = new Cat();
		/*a.sound();*/ b.sound(); c.sound();
		/*test(a);*/ test(b); test(c);
	}
	static void test(Animal1 temp) { //temp는 임시로 이름만든거 //
		temp.sound();
	}

}
