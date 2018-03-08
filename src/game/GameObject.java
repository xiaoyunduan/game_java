package game;

import java.awt.Image;
import java.awt.Rectangle;

public class GameObject {
	Image img;
	double x,y;
	int height,width;
	double speed=8;
	
	 public Rectangle getRect(){
		  Rectangle r=new Rectangle((int)x,(int)y,width,height);
		  return r;
	 }
	 public GameObject(){
		 
	 }
	 public GameObject(Image img,double x,double y,int speed,int width,int height){
		 this.img=img;
		 this.x=x;
		 this.y=y;
		 this.speed=speed;
		 this.height=height;
		 this.width=width;
	 }
}
