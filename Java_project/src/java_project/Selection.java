package java_project;

import java.util.*;// ��ǻ�Ͱ� �𸣴� ��ɾ� ������//

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int in;
		in = input.nextInt();
		// �����̰� �����̰� �߰�ȣ ���̴� ����������//
		
		if(in==0){
			System.out.println("in is 0");
		}else if((in%2)==0){
			System.out.println("in is even");
		}else {
			System.out.println("in is odd");
		}
		
		switch(in % 2){                        //����ġ ������ 0�̳� 1�� ��//
			case 0:
				System.out.println("in is even");
				break;
			case 1:
				System.out.println("in is odd");
				break;
		}

	}
}
