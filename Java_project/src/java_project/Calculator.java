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
		System.out.println("multi:"+ r);
		
		input.close();
	}

}
