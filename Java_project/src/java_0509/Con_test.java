package java_0509;

class Par{
	Par(){
		System.out.println("par con");
	}
	Par(int x) {
		System.out.println("Par con" + x);
	}
}

class child extends Par {
	/*child() {
		System.out.println("child con"); 밑과 이거 둘다가능.
	}*/
	int xxxx;

	public child(int y) {
		super(y); // super는 부모클래스 매소드를 둘중에 하나를 선택할 수 있는것. // 
		this.xxxx = 999;
		System.out.println("child con");
	}
	public child() {
		System.out.println("child con nothing");
	}
}

public class Con_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1 = new child(5);
		child c2 = new child();

	}

}
