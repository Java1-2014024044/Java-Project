package java_project;

import java.util.*;// 컴퓨터가 모르는 명령어 모음집//

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int in;
		in = input.nextInt();
		// 한줄이건 두줄이건 중괄호 붙이는 버릇가지자//
		
		if(in==0){
			System.out.println("in is 0");
		}else if((in%2)==0){
			System.out.println("in is even");
		}else {
			System.out.println("in is odd");
		}
		
		switch(in % 2){                        //스위치 문에는 0이나 1만 들어감//
			case 0:
				System.out.println("in is even");
				break;
			case 1:
				System.out.println("in is odd");
				break;
		}

	}
}
