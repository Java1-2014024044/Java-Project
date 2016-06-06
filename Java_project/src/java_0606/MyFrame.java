package java_0606;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel { // 어뎁터로 바꿀줄 알아야함 //
	BufferedImage img = null;
	int img_x = 0, img_y = 0;
	
	public MyPanel() {
	try {
		img = ImageIO.read(new File("car.gif"));
	} catch (IOException e) {
		System.out.println("no image");
		System.exit(1);
	}
	addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent e) {
			img_x = e.getX();
			img_y = e.getY();
			repaint();
		}
		/*public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {} 이거 어뎁터로 바꾸기전*/
		
	});
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class MyFrame extends JFrame{
	public MyFrame() {
		add(new MyPanel());
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();

	}

}
