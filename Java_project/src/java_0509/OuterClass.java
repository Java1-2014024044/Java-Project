package java_0509;

public class OuterClass { // 300p�ҽ��� //
	private int value = 10;
	
	class InnerClass {
		public void myMethod() {
			System.out.println("�ܺ� Ŭ���� private ���� ��: " + value);
		}
	}
	
	OuterClass() {
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}

}
