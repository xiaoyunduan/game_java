package game;

import java.awt.Graphics;
import java.awt.Image;

public class Star {
double x,y;
double width,height;
Image img;

public Star(){
	
}
//构造器互相调用
public Star(Image img){
	this.img=img;
	this.width=img.getWidth(null);
	this.height=img.getWidth(null);
	
}
public Star(Image img,double x,double y){
	this(img);
	this.x=x;
	this.y=y;
}
public Star(String path,double x,double y){
	this(GameGui.getImage(path),x,y);
}
//


public  void drawstar(Graphics g){
	g.drawImage(img,(int) x,(int) y,null);
}
}
