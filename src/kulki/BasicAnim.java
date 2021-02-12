package kulki;



import java.util.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.List;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class BasicAnim extends JPanel implements MouseListener,MouseMotionListener
{       
    UsageFrame okno;
    Boolean wektor_kul1=false;
    Boolean wektor_kul2=false;
    Boolean wektor_kul3=false;
    Boolean wektor_or_place=false;
    Boolean pierwszy = false;
    Boolean place_kul1=false;
    Boolean place_kul2=false;
    Boolean place_kul3=false;
    
        // srednica
    int dim = 50;
        // polozenie
    int x = 75, y = 75;
        // kierunek ruchu
    int dx = 3, dy = 5;
        // opoznienie odswiezania
    int delay = 30;
    
    Point point,prpoint, tmppoint;
    
    Kulka kule[] = new Kulka[3];
    
 public BasicAnim(){
            kule[0] = new Kulka(70, 50, 200,6,8, false,18);
            kule[1] = new Kulka(50, 250, 200,-6,8, false,8);
            kule[2] = new Kulka(30, 450, 200,-6,8, false,2);
            point = null;
            prpoint = null;
            tmppoint = null;
            this.addMouseListener(this);
            this.addMouseMotionListener(this);
         
 }
   
   public void setUsageFrame(UsageFrame uf){
       this.okno=uf;
       
   }
    
   public int distanceTo(Kulka a, Kulka b) {
                         double tmp_x = a.x + (a.dim/2);
                         double tmp_y = a.y + (a.dim/2);
                         double tmp_nx = b.x+(b.dim/2);
                         double tmp_ny =  b.y+(b.dim/2);
       
			int  distance = (int) Math.sqrt(((tmp_x - tmp_nx) * (tmp_x - tmp_nx)) + ((tmp_y - tmp_ny) * (tmp_y - tmp_ny)));
			System.out.println("Dystans"+distance);
                        if (distance < 0) { distance = distance * -1; }
                        return distance/*distance*/;
		}
   
   
   
	
	
	
	
	
	
   
   public void  detectCollisions(Kulka kul) {
			int odleglosc;
                       
			for ( int n = 0; n < kule.length; n++) {
                            //sprawdzamy czy kule sa w ruchu i czy nie sprawdzamy tej samej kuli
				if ((kule[n] != kul)&&(kule[n].ruch==true)) {
                                          double tmp_x = kul.x + (kul.dim/2);
                                          double tmp_y = kul.y + (kul.dim/2);
                                          double tmp_nx = kule[n].x+(kule[n].dim/2);
                                          double tmp_ny =  kule[n].y+(kule[n].dim/2); 
					   
					
                                           if (tmp_x + kul.dim + kule[n].dim >   tmp_nx
					&& tmp_x <  tmp_nx + kul.dim + kule[n].dim 
					&& tmp_y + kul.dim + kule[n].dim > tmp_ny
					&& tmp_y < tmp_ny +  kul.dim + kule[n].dim) {
                                            
						if ((distanceTo(kul, kule[n])) < ( kul.dim/2 + kule[n].dim/2)) {					
							calculate_velocity(kul, kule[n]);}}
				}
			}
					
   }
   
    public void calculate_velocity(Kulka kula1, Kulka kula2){
                
         System.out.println("#Kolizja!!!!");
         double xodl,yodl, px, py, p, cosalfa,dp, dpx,dpy,odleglosc;
         double tmp_x = kula1.x + (kula1.dim/2);
         double tmp_y = kula1.y + (kula1.dim/2);
         double tmp_nx = kula2.x+(kula2.dim/2);
         double tmp_ny =  kula2.y+(kula2.dim/2);
           
         xodl=tmp_x-tmp_nx;
         yodl=tmp_y-tmp_ny ;
         odleglosc=Math.sqrt( (xodl*xodl)+ (yodl*yodl));
                                                                   // licz wektor p
         px=(kula2.dx- kula1.dx)*kula2.masa;
         py=(kula2.dy- kula1.dy)*kula2.masa;

         p=Math.sqrt(  Math.pow(px,2)+ Math.pow(py,2));
         
         if (p>0)
         {

         cosalfa =( (xodl*px)+(yodl*py)  )/(odleglosc*p);      // policz kosinus alfa

         if (cosalfa>0)
           {
             // policz  dp
             dp=p*cosalfa*2*kula1.masa/(kula1.masa+kula2.masa);
             dpx=(xodl/odleglosc)*dp;                                                      
             dpy=(yodl/odleglosc)*dp;

            //wyznacz predkosc po zderzeniu dla kuli 1
             kula1.dx+=dpx/kula1.masa;                 
             kula1.dy+=dpy/kula1.masa;                 

             //wyznacz predkosc po zderzeniu dla kuli 2

             kula2.dx-=dpx/kula2.masa;
             kula2.dy-=dpy/kula2.masa;
           }
         
         }
         
    }       
                
 
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D graph = (Graphics2D)g;
        
        
    if((point!=null))//&&(zacznij==true))
    {
        if (wektor_or_place == false){
        g.setColor(Color.RED);
        int tmp_x = (prpoint.x-point.x)/10;
        int tmp_y = (prpoint.y-point.y)/10;
     
        
        g.drawLine(point.x,point.y,prpoint.x,prpoint.y);
        if (wektor_kul1==true) {kule[0].setDX(tmp_x); kule[0].setDY(tmp_y);
        okno.setKulka(kule[0],0);
        System.out.println("wektor kulki x "+kule[0].dx+" wektor kulki y "+kule[1].dy);
     
        }
        if (wektor_kul2==true) {kule[1].setDX(tmp_x); kule[1].setDY(tmp_y);
         okno.setKulka(kule[1],1);
         //wektor_kul2=false;
        }
        if (wektor_kul3==true) {kule[2].setDX(tmp_x); kule[2].setDY(tmp_y);
         okno.setKulka(kule[2],2);
       
        }
        
        } else {
        int tmp_x = prpoint.x;
        int tmp_y = prpoint.y;
        int collisionPointX;
        int collisionPointY;
         if (place_kul1==true) {
         
        kule[0].setX(tmp_x-kule[0].dim/2); kule[0].setY(tmp_y-kule[0].dim/2);
        okno.setKulka(kule[0],0);
        System.out.println("polozenie kulki  1 x "+kule[0].x+" polozenie kulki 1 y "+kule[0].y);
     
        }
        if (place_kul2==true) {
         kule[1].setX(tmp_x-kule[1].dim/2); kule[1].setY(tmp_y-kule[1].dim/2);
         okno.setKulka(kule[1],1);
         System.out.println("polozenie kulki  2 x "+kule[1].x+" polozenie kulki 2 y "+kule[1].y);
      
        }
        if (place_kul3==true) {kule[2].setX(tmp_x-kule[2].dim/2); kule[2].setY(tmp_y-kule[2].dim/2);
         okno.setKulka(kule[2],2);
         System.out.println("polozenie kulki  3 x "+kule[2].x+" polozenie kulki 3 y "+kule[2].y);
   
        }
       }  
      
    
    }
    //rysowanie kul
        for (int i =0; i<3; i++){
            if (i==0) { graph.setColor(Color.cyan);}else if (i==1) {graph.setColor(Color.red);} else if (i==2) {graph.setColor(Color.green);}
        
        graph.fillOval((int)kule[i].x,(int) kule[i].y, kule[i].dim, kule[i].dim);
        
        }
        
    
        
        
    }

    
    public void startAnim(){
       
        
        if (pierwszy == false){
            okno.setKulka(kule[0],0);
            okno.setKulka(kule[1],1);
            okno.setKulka(kule[2],2);
            pierwszy = true;
        }
        while(true){  
        	
       for (int i = 0; i<3; i++){
                // odbicie
        if (kule[i].ruch == true){    
            //sprawdzenie czy przy dodaniu wektora dx do polozenia x niedochodzi do wychodzenia poza obszar na osi x
            if(kule[i].x + kule[i].dim >= getWidth() || kule[i].x <= 0)   
            {
            kule[i].dx = -kule[i].dx; }
            //sprawdzenie czy przy dodaniu wektora dy do polozenia x niedochodzi do wychodzenia poza obszar na osi y
            if(kule[i].y + kule[i].dim >= getHeight() || kule[i].y <= 0)
            {{
            kule[i].dy = -kule[i].dy;
            }}
             //sprawdzenie czy przy dodaniu wektora dx do polozenia x dochodzi do wychodzenia poza obszar na osi x po prawej stronie   
            if ((kule[i].x+kule[i].dx+kule[i].dim)>getWidth())
            {
             
            kule[i].x +=kule[i].dx -((kule[i].x+kule[i].dx+kule[i].dim)-getWidth());
    
            } //sprawdzenie czy przy dodaniu wektora dx do polozenia x dochodzi do wychodzenia poza obszar na osi x po prawej stronie 
             else if(((kule[i].x+(kule[i].dx))<0)&&(kule[i].dx<0)){
                 kule[i].x += kule[i].dx - (kule[i].x+kule[i].dx);  }
             //gdy nie dochodzi do kolizji ze sciana 
             else kule[i].x += kule[i].dx;
           
            //sprawdzenie czy przy dodaniu wektora dy do polozenia y dochodzi do wychodzenia poza obszar na osi y na dole
           if ((kule[i].y+kule[i].dy+kule[i].dim)>getHeight())
            {
            
            kule[i].y += kule[i].dy -((kule[i].y+kule[i].dy+kule[i].dim)-getHeight());
            }//sprawdzenie czy przy dodaniu wektora dy do polozenia y dochodzi do wychodzenia poza obszar na osi y na gorze
             else if(((kule[i].y+(kule[i].dy))<0)&&(kule[i].dy<0))
             {
                 kule[i].y += kule[i].dy - (kule[i].y+kule[i].dy);
             }
             //gdy nie dochodzi do kolizji ze sciana 
             else kule[i].y += kule[i].dy;

             detectCollisions(kule[i]);
             okno.setKulka(kule[i],i);
            
        	
            try{
                Thread.sleep(delay);
            }
            catch(InterruptedException e){
            }
        	}
        }
           repaint();      
        
        }
    }
    
    public Dimension getPreferredSize(){
        return new Dimension(600, 300);
       
    }


    
    @Override
    public void mouseClicked(MouseEvent arg0) {}

    @Override
    public void mouseEntered(MouseEvent arg0) {}

    @Override
    public void mouseExited(MouseEvent arg0) {}

    @Override
    public void mousePressed(MouseEvent me) {
        
     int button=me.getButton();   
     tmppoint=me.getPoint();
     System.out.println("x "+tmppoint.x+" y "+ tmppoint.y);
     //jesli wcisnieto prawy guzik i najechano na jedna z kul
     if (button == 3){
     if (((tmppoint.x>=kule[0].x)&&(tmppoint.x<=kule[0].x+kule[0].dim)) &&((tmppoint.y>=kule[0].y)&&(tmppoint.y<=kule[0].y+kule[0].dim))&&(kule[0].ruch==false)){
        //zapamietanie polozenia
        point=tmppoint;
        //wysrodkowanie polozenia myszki w centrum kulki
        point.x=(int) kule[0].x+(kule[0].dim/2);
        point.y=(int)kule[0].y+(kule[0].dim/2);
        //zmiennie wykorzystywane do ustalenia czy przesuwamy kule czy rysujemy wektor
        wektor_kul1=true;
        wektor_or_place = false;
    }
     else  if (((tmppoint.x>=kule[1].x)&&(tmppoint.x<=kule[1].x+kule[1].dim)) &&((tmppoint.y>=kule[1].y)&&(tmppoint.y<=kule[1].y+kule[1].dim))&&(kule[1].ruch==false)){
        point=tmppoint;
        point.x=(int)kule[1].x+(kule[1].dim/2);
        point.y=(int)kule[1].y+(kule[1].dim/2);
        wektor_kul2=true;
        wektor_or_place = false;
    } else  if (((tmppoint.x>=kule[2].x)&&(tmppoint.x<=kule[2].x+kule[2].dim)) &&((tmppoint.y>=kule[2].y)&&(tmppoint.y<=kule[2].y+kule[2].dim))&&(kule[2].ruch==false)){
        point=tmppoint;
        point.x=(int)kule[2].x+(kule[2].dim/2);
        point.y=(int)kule[2].y+(kule[2].dim/2);
        wektor_kul3=true;
        wektor_or_place = false;
    }
    }
    else  if (button == 1){
     if (((tmppoint.x>=kule[0].x)&&(tmppoint.x<=kule[0].x+kule[0].dim)) &&((tmppoint.y>=kule[0].y)&&(tmppoint.y<=kule[0].y+kule[0].dim))&&(kule[0].ruch==false)){
        System.out.println("ZMIANA POLOZENIA KULA1 ");
        point=tmppoint;
        point.x=(int)kule[0].x+(kule[0].dim/2);
        point.y=(int)kule[0].y+(kule[0].dim/2);
        place_kul1=true;
        wektor_or_place = true;
    }
     else  if (((tmppoint.x>=kule[1].x)&&(tmppoint.x<=kule[1].x+kule[1].dim)) &&((tmppoint.y>=kule[1].y)&&(tmppoint.y<=kule[1].y+kule[1].dim))&&(kule[1].ruch==false)){
        System.out.println("ZMIANA POLOZENIA KULA2 ");
        point=tmppoint;
        point.x=(int)kule[1].x+(kule[1].dim/2);
        point.y=(int)kule[1].y+(kule[1].dim/2);
        place_kul2=true;
        wektor_or_place = true;
    } else  if (((tmppoint.x>=kule[2].x)&&(tmppoint.x<=kule[2].x+kule[2].dim)) &&((tmppoint.y>=kule[2].y)&&(tmppoint.y<=kule[2].y+kule[2].dim))&&(kule[2].ruch==false)){
        System.out.println("ZMIANA POLOZENIA KULA3 ");
        point=tmppoint;
        point.x=(int)kule[2].x+(kule[2].dim/2);
        point.y=(int)kule[2].y+(kule[2].dim/2);
        place_kul3=true;
        wektor_or_place = true;
    }
     
     
     
  }
 
     
}

    @Override
    public void mouseReleased(MouseEvent me) {
    point=null;
    //w przypadku puszczenia guziku myszki zmiana zmienej aby przestac rysowac
    if  (wektor_kul1==true) wektor_kul1=false; 
    if  (wektor_kul2==true) wektor_kul2=false; 
    if  (wektor_kul3==true) wektor_kul3=false; 
    if  (place_kul1==true) place_kul1=false; 
    if  (place_kul2==true) place_kul2=false; 
    if  (place_kul3==true) place_kul3=false; 
    
    }

    @Override
    public void mouseDragged(MouseEvent me) {
    //prpoint=point;
    prpoint=me.getPoint();
    repaint();
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
    
    }

    
    public static void main(String[] args){

        JFrame frame = new JFrame("Symulacja ruchu kulek");
        
        BasicAnim anim  = new BasicAnim();
        anim.setBorder(BorderFactory.createLineBorder(Color.blue));
        UsageFrame okno = new UsageFrame();
        frame.getContentPane().add(anim);
        frame.getContentPane().add(okno,BorderLayout.LINE_END);
        frame.setLocation(300, 300);
        okno.setBasicAnim(anim);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
        anim.setUsageFrame(okno);
            // rozpoczecie animacji
        anim.startAnim();
    }

}
