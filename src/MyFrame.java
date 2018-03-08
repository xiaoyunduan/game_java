import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.JFrame;

public class MyFrame {
int height,width;
double x,y;
Image img;
public void setgui(){
	JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Mypanel pane=new Mypanel();
	frame.getContentPane().add(pane);
	frame.setSize(width, height);
	frame.setVisible(true);
}
class Mypanel extends Panel{
	public void paint(Graphics g){
		g.drawImage(img,(int) x,(int) y, null);
	}
}
}
