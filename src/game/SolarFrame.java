package game;

import java.awt.Graphics;

public class SolarFrame  extends MyFrame{
     
	 Star s=new Star("images/tq.png",150,150);
	 Planet p=new Planet(s,"images/tq.png",60,30,0.5);
	
	public SolarFrame(){
		  super(250,150,300,500,"images/tq.png");
	}
	public void paint(Graphics g){
		s.drawstar(g);
		p.drawstar(g);
	  
	 
  }
	/*public void athread(){
		Thread t=new Thread(new Runnable(){
			public void run(){
				new SolarFrame().setgui();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		try{
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}*/
public static void main(String[] args){
	
	new SolarFrame().setgui();
}
}
