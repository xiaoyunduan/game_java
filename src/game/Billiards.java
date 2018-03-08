package game;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Billiards {
 
	Image img=GameGui.getImage("images/tq.png");
	
	JFrame frame;
	private double x=0,y=0;

	private double degree=3.14/3;
	private double speed=10;
	class Mypiant extends JPanel{
		public void paint(Graphics g){
			
			g.drawImage(img, (int)x, (int)y, null);
			if(speed>0){
				speed-=0.03;
			}else{
				speed=0;
			}
			x+=speed*Math.cos(degree);
			y+=speed*Math.sin(degree);
			if(y>450||y<0){
				degree=-degree;
			}
			if(x>750||x<0){
				degree=Math.PI-degree;
			}
		}
	}
	
	public void draw(){
		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mypiant ap=new Mypiant();
		
		frame.getContentPane().add(BorderLayout.CENTER,ap);
		
		
		frame.setSize(800, 500);
		frame.setVisible(true);
		Thread t=new Thread(new Runnable(){
			public void run(){
				while(true){
					frame.repaint();
				try{
					Thread.sleep(50);
				}catch(Exception ex){
					ex.printStackTrace();
				}
				}
				
			}
		});
		t.start();
		 
	}
	public static void main(String[] args){
		Billiards example=new Billiards();
		example.draw();
	}
}
