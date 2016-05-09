package java_0509;

public class OuterClass { // 300p소스봐 //
	private int value = 10;
	
	class InnerClass {
		public void myMethod() {
			System.out.println("외부 클래스 private 변수 값: " + value);
		}
	}
	
	OuterClass() {
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}

}
