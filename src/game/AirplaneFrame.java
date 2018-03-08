package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;

public class AirplaneFrame extends MyFrame{
	int x=50,y=50;
	 int bgspeed=10;
	Image bg=GameGui.getImage("images/xk.jpg");
	int bgx=0,bgy=-(bg.getHeight(null)-300);
	
	Airplane aplane=new Airplane(100,100,"images/tq.png");
	Explode bao;
	 boolean peng;
	ArrayList<Bullet> bulletList=new ArrayList<Bullet>();

	
	
   public void paint(Graphics g){
	 
	  g.drawImage(bg, bgx, bgy, null);
	  if(bgy<-20)
		   bgy+=bgspeed;
	 
	   
        aplane.draw(g);
	    for(int i=0;i<10;i++){
		   Bullet b=new Bullet();
		   bulletList.add(b);
		  bulletList.get(i).draw(g);
		 
		  peng=bulletList.get(i).getRect().intersects(aplane.getRect());
		 //判断飞机距形和子弹距形是否相碰
		 if(peng){
			 System.out.println("ppp");
			 aplane.img=null;
			 bgspeed=0;
			 aplane.setLife(false);
			 break;//
		 }
		
	   }
	    
	    if(!aplane.getlife()){
	    	if(bao==null){
				bao=new Explode(aplane.x,aplane.y);
			}
			bao.draw(g);
			printsth (g,"Game Over",50);
			
		 }
	  
	   
   }
   
   
   public void printsth(Graphics g,String str,int size){
	   Color c=g.getColor();
	   g.setColor(Color.white);
	   Font f=new Font("宋体",Font.BOLD,size);
	   g.setFont(f);
	   g.drawString(str, 100,150);
	   g.setColor(c);
   }
   public void gameRequest(){
	   JButton again=new JButton("Again");
	   again.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	  this.add(again);
   }
   
   public AirplaneFrame(){
	   super(500,300);
   }
   
   
 public void setgui(){
	
	 super.setgui();

	 frame.addKeyListener(new KeyMonitor());
 }
   
   
   class KeyMonitor extends KeyAdapter{
	 
	  @Override
	public void keyPressed(KeyEvent e) {
		 
		
		 aplane.movePress(e);
		  System.out.println(e.getKeyCode());
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		  aplane.moveReleased(e);
		  System.out.print("released");
	}
	
   }
   
   public static void main(String[] args){
		AirplaneFrame example=new AirplaneFrame();
		example.setgui();
		
	}
   
}
