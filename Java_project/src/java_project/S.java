package java_project;

public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello World";
		String s1,s2,s3;
		boolean s4;
		
		System.out.println("문자열의 길이:" + a.length());
		s1=a.concat(" "+ "WE ARE");
		s2=a.replace('e', 'E');
		s3=a.substring(2, 5);
		s4=a.isEmpty();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

}
}
