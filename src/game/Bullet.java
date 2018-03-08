package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet extends GameObject{

 double degree;

 
 public Bullet(){
	 width=10;
	 height=10;
	 x=0;
	 y=0;
	 degree=Math.random()*Math.PI*2;
 }
 
 public Rectangle getRect(){
	  Rectangle r=new Rectangle((int)x,(int)y,width,height);
	  return r;
 }
 
 public void draw(Graphics g){
	 Color c=g.getColor();
	 g.setColor(Color.yellow);
	 g.fillOval((int)x, (int)y, width, height);
	 
	 x+=speed*Math.cos(degree);
	 y+=speed*Math.sin(degree);
	 if(y>300||y<0){
			degree=-degree;
		}
		if(x>500||x<0){
			degree=Math.PI-degree;
		}
 }
}
