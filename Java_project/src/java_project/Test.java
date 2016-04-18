package java_project;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello World";
		String s1,s2,s3,s4;
		char s5;
		int s6;
		boolean s7;
		boolean s8;
		
		s1 = a.concat(" "+"WE ARE");
		s2 = a.replace('e', 'E');
		s3 = a.toUpperCase();
	    s4 = a.substring(2, 5);
		s5 = a.charAt(1);
		s6 = a.compareTo("DDDDDDDDDDD");
		s7 = a.equals("dddddddd");
		s8 = a.isEmpty();
		
	    
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(s3);
	    System.out.println(s4);
	    System.out.println(s5);
	    System.out.println(s6);
	    System.out.println(s7);
	    System.out.println(s8);

	}
}

