package java_04_25;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("�̸��� " + obj.getName() + "���� �ܰ��"+obj.getBalance() + "�Դϴ�.");
		
		Account ac1 = new Account(1,"2",3);
		Account ac2 = new Account();
	}

}
