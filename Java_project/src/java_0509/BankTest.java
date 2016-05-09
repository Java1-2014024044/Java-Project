package java_0509;

class Bank {
	double GIR() {
		return 0.0;
	}
}

class Badbank extends Bank {
	double GIR() {
		return 10.0;
	}
}

class Normalbank extends Bank {
	double GIR() {
		return 5.0;
	}
}

class Goodbank extends Bank {
	double GIR() {
		return 3.0;
	}
}

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Badbank b1 = new Badbank();
		Normalbank b2 = new Normalbank();
		Goodbank b3 = new Goodbank();
		System.out.println("Badbank의 이자율: " + b1.GIR());
		System.out.println("Normalbank의 이자율: " + b2.GIR());
		System.out.println("Goodbank의 이자율: " + b3.GIR());

	}

}
