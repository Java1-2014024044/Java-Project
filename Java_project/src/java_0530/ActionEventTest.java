package java_0530;
import javax.swing.*;
import java.awt.event.*;



class MyFrame extends JFrame /*implements ActionListener #3*/{
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");
		/*button.addActionListener(this); #3*/
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					label.setText("��ħ�� ��ư�� ���������ϴ�");
				}
			}
		});
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
}
	
/*	class MyListener implements ActionListener { #2 �̹�� ��ȣ*/
/*		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button){
				label.setText("��ħ�� ��ư�� ���������ϴ�.");
			}
		}
	}#2,3��*/
	



public class ActionEventTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t = new MyFrame();
	}
}
