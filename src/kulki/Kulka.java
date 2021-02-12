package kulki;

import java.awt.Color;

class Kulka {
 
	   // srednica
 public  int dim;
        // polozenie
 public   double x, y;
        // kierunek ruchu
 public  double dx, dy;
 
 public int masa;
 
 public boolean ruch = false;
 
 public Color color;
 
 
    
public Kulka(int dim, float x, float y, float dx, float dy, boolean ruch, int masa){
	
	this.dim = dim;
	this.x = x;
	this.y = y;
	this.dx = dx;
	this.dy = dy;
	this.ruch = ruch;
        this.masa=masa;
}

public void setDim(int dim){
	this.dim = dim;
}


public void setX(double x){
	this.x = x;
}

public void setMasa(int x){
	this.masa = x;
}
public void setY(double y){
	this.y = y;
}

public void setDX(double dx){
	this.dx = dx;
}
public void setDY(double dy){
	this.dy = dy;
}

public void setRuch(boolean ruch){
	this.ruch = ruch;
}

public void setColor(Color c){
    this.color=c;
}
}
