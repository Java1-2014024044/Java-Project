package java_project;

public class Mtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M mytv = new M();
		mytv.channel =7;
		mytv.volume =10;
		mytv.onOff = true;
		mytv.volumeUP();
		mytv.volumeUP(30);
		
		mytv.pr();

	}

}
