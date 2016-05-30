package java_0530;
import javax.swing.*;
import java.awt.event.*;



class MyFrame extends JFrame /*implements ActionListener #3*/{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예쩨");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		/*button.addActionListener(this); #3*/
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					label.setText("마침내 버튼이 눌러졌습니다");
				}
			}
		});
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
}
	
/*	class MyListener implements ActionListener { #2 이방법 선호*/
/*		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button){
				label.setText("마침내 버튼이 눌러졌습니다.");
			}
		}
	}#2,3번*/
	



public class ActionEventTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t = new MyFrame();
	}
}
