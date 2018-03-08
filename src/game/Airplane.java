package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Airplane extends GameObject{

	boolean up,down,right,left;
	boolean life=true;
	
	public void setLife(boolean life){
		this.life=life;
	}
	public boolean getlife(){
		return life;
	}
	
  public Airplane(int x,int y,String path){
		img=GameGui.getImage(path);
		this.height=img.getHeight(null);
		this.width=img.getWidth(null);
		this.x=x;
		this.y=y;
	}
  
  
	public void draw(Graphics g){
		
			g.drawImage(img,(int)x,(int)y,null);
		    direction();
		
		
	}
	public void direction(){
		if(up){
			y-=speed;
		}
		if(down){
			y+=speed;
		}
		if(right){
			x+=speed;
		}
		if(left){
			x-=speed;
		}
	}
	public void movePress(KeyEvent e){
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:  up=true;break;
		case KeyEvent.VK_DOWN: down=true;break;
		case KeyEvent.VK_RIGHT: right=true;break;
		case KeyEvent.VK_LEFT: left=true;break;
		default:break;
		}
	}
		public void moveReleased(KeyEvent e){
			switch(e.getKeyCode()){
			case KeyEvent.VK_UP:  up=false;break;
			case KeyEvent.VK_DOWN: down=false;break;
			case KeyEvent.VK_RIGHT: right=false;break;
			case KeyEvent.VK_LEFT: left=false;break;
			default:break;
			}
	
}
		
		}
