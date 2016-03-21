package java_project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10 , y = 20, result;
		result = x + y;
		System.out.println(result);
		
		Scanner input = new Scanner(System.in); 
		
		int i,j,r;
		i= input.nextInt();
		j= input.nextInt();
		
		r=i*j;
		System.out.println("multi:"+ r); // y=++x는 x가 먼저 처먹고 y로 넌기고 x++은 y에게 먼저 넘겨주고 자기가 처먹는다.//
		
		input.close();
	}

}
//조건문 반복문, if(조건식){
//System.out.printfln("럭");
//System.out.prittfln("~~~");
//}else if
//else if