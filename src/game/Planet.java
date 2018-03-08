package game;

import java.awt.Color;
import java.awt.Graphics;

public class Planet extends Star {
double lAxit,sAxit;
double speed;
double degree;
Star center;
public Planet(Star center,String imgpath,double lAxit,double sAxit,double speed){
	super(GameGui.getImage(imgpath));
	this.center=center;
	this.x=center.x+center.width/2+lAxit;
	this.y=center.y; 
	this.lAxit=lAxit;
	this.sAxit=sAxit;
	this.speed=speed;
}
public void drawstar(Graphics g){
	x=(center.x)+lAxit*Math.cos(degree);
	y=(center.y)+sAxit*Math.sin(degree);
	degree+=speed;
	super.drawstar(g);
	drawTrack(g);
}
public void drawTrack(Graphics g){
	double tx,ty,twidth,theight;
	twidth=lAxit*2;
	theight=sAxit*2;
	tx=(center.x+center.width/2)-lAxit;
	ty=(center.y+center.height/2)-sAxit;
	
	Color c=g.getColor();
	g.setColor(Color.blue);
	g.drawOval((int)tx, (int)ty, (int)twidth,(int) theight);
	g.setColor(c);
}
}
