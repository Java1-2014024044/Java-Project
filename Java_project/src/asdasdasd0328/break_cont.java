package asdasdasd0328;

public class break_cont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1 ; i<=4;i++){
			System.out.println("before: "+i);
			if(i==1) continue; // 이건 2만 after가 안떠 //
			System.out.println("after: "+i);
			System.out.println("*************");
			if(i==2) break; // 이건 3뒤에 다 끝내 //
		}

	}

}
