package game;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;import javax.management.monitor.CounterMonitorMBean;

public class Explode {
     double x,y;
     boolean isend;
    static  ArrayList<Image> imgs=new ArrayList<Image>();
    static{
    	for(int i=0;i<5;i++){
    		Image img=GameGui.getImage("images/e"+(i+1)+".jpg");
            imgs.add(img);
            imgs.get(i).getWidth(null);
    	}
    }
    
     int count=0;
     
     public void draw(Graphics g){
    	if(count<6){
    	 g.drawImage(imgs.get(count),(int)x,(int)y,null);
    	count++;
    	 }
    	if(count==6){
    		isend=true;
    	}
    	
     }
     
     public Explode(double x,double y){
    	 this.x=x;
    	 this.y=y;
     }
}
