package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JPanel{
int height,width;
double x,y;
public Image img;
JFrame frame;
Thread t;
boolean judge=true;
public MyFrame(){
	
}
public MyFrame(int width,int height){
	this.width=width;
	this.height=height;
}
public MyFrame(double x,double y,int height,int width,String path){
	this.x=x;
	this.y=y;
	this.height=height;
	this.width=width;
	img=GameGui.getImage(path);

}

public void setgui(){
    frame=new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.getContentPane().add(this);
	frame.setSize(width, height);
	frame.setVisible(true);
	 t=new Thread(new Runnable(){
		public void run(){
			while(judge){
			frame.repaint();
			try{
				Thread.sleep(100);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			}
		}
	});
	t.start();
}

	public void paint(Graphics g){
		g.drawImage(img,(int) x,(int) y, null);
	
	}
	public static void main(String[] args){
		new MyFrame(250,150,300,500,"images/tq.png").setgui();
	}

}