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
		System.out.println("Badbank�� ������: " + b1.GIR());
		System.out.println("Normalbank�� ������: " + b2.GIR());
		System.out.println("Goodbank�� ������: " + b3.GIR());

	}

}
