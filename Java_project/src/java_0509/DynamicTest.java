package java_0509;

abstract class Animal1 /* �����Ѱ��߿� animal �־ ��Ǵ°�*/ {
	abstract void sound(); /*{ animal���� �Ҹ��� �پ� �״ϱ� sound���� �Ҹ��� �� ������ �ʿ䰡 ����.
		System.out.println("Ani");
	}*/
	void eat() {
		System.out.println("ani eat");
	}
}
class Dog extends Animal1 {
	private int d=11;
	@Override // override��  ������ �������̵� �ߴٴ°� ǥ�����ִ°� �Ǽ� �������̴� �̰� �ϰ� ���� sound ����� �����ٶ��. //
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
		Animal1 b = new Dog(); // dog�� cat�� animal1�� �������ִ�.//
		Animal1 c = new Cat();
		/*a.sound();*/ b.sound(); c.sound();
		/*test(a);*/ test(b); test(c);
	}
	static void test(Animal1 temp) { //temp�� �ӽ÷� �̸������ //
		temp.sound();
	}

}
