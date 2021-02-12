package kulki;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class UsageFrame extends JPanel {
    
        BasicAnim basicanim;
	
        private JButton btn = new JButton("Stop/Start");
        private JButton btn2 = new JButton("Stop/Start");
        private JButton btn3 = new JButton("Stop/Start");
        
        
        private JButton zmien_war1 = new JButton("Zmien wartosc");
        private JButton zmien_war2  = new JButton("Zmien wartosc");
        private JButton zmien_war3  = new JButton("Zmien wartosc");
        
        
	JLabel kula1_tekst = new JLabel("Kula 1 :");
	JLabel kula1_rozmiar = new JLabel("Srednica :");
	JLabel kula1_polozenie = new JLabel("Polozenie :");
	JLabel kula1_wektor = new JLabel("Wektor ruchu :");
	JLabel kula1_x = new JLabel("x - ");
	JLabel kula1_y = new JLabel("y - ");
	JLabel kula1_wektordx = new JLabel("dx - ");
	JLabel kula1_wektordy = new JLabel("dy - ");
        JLabel kula1_masa = new JLabel("Masa");
	JTextField kula1_sred = new JTextField("Kula1");
	JTextField kula1_xx = new JTextField("X");
	JTextField kula1_yy= new JTextField ("Y");
	JTextField kula1_dx = new JTextField("DX");
	JTextField kula1_dy= new JTextField ("DY");
        JTextField kula1_masatxt= new JTextField ("masa");
        
        JLabel kula2_tekst = new JLabel("Kula 2 :");
	JLabel kula2_rozmiar = new JLabel("Srednica :");
	JLabel kula2_polozenie = new JLabel("Polozenie :");
	JLabel kula2_wektor = new JLabel("Wektor ruchu :");
	JLabel kula2_x = new JLabel("x - ");
	JLabel kula2_y = new JLabel("y - ");
	JLabel kula2_wektordx = new JLabel("dx - ");
	JLabel kula2_wektordy = new JLabel("dy - ");
        JLabel kula2_masa = new JLabel("Masa");
	JTextField kula2_sred = new JTextField("Kula2");
	JTextField kula2_xx = new JTextField("X");
	JTextField kula2_yy= new JTextField ("Y");
	JTextField kula2_dx = new JTextField("DX");
	JTextField kula2_dy= new JTextField ("DY");
        JTextField kula2_masatxt= new JTextField ("masa");
        
        JLabel kula3_tekst = new JLabel("Kula 3 :");
	JLabel kula3_rozmiar = new JLabel("Srednica :");
	JLabel kula3_polozenie = new JLabel("Polozenie :");
	JLabel kula3_wektor = new JLabel("Wektor ruchu :");
	JLabel kula3_x = new JLabel("x - ");
	JLabel kula3_y = new JLabel("y - ");
	JLabel kula3_wektordx = new JLabel("dx - ");
	JLabel kula3_wektordy = new JLabel("dy - ");
        JLabel kula3_masa = new JLabel("Masa");
	JTextField kula3_sred = new JTextField("Kula3");
	JTextField kula3_xx = new JTextField("X");
	JTextField kula3_yy= new JTextField ("Y");
	JTextField kula3_dx = new JTextField("DX");
	JTextField kula3_dy= new JTextField ("DY");
        JTextField kula3_masatxt= new JTextField ("masa");
       
      
       
	
public	UsageFrame(){
		setPreferredSize(new Dimension(450, 500));
		btn.setSize(new Dimension(100,100));
		//add(btn);
                setLayout(null);
		add(kula1_tekst);
		add(kula1_rozmiar);
		add(kula1_sred);
		add(kula1_polozenie);
		add(kula1_x);
		add(kula1_xx);
		add(kula1_y);
		add(kula1_yy);
		add(kula1_wektor);
		add(kula1_wektordx);
		add(kula1_dx);
		add(kula1_wektordy);
		add(kula1_dy);
                add(kula1_masa);
                add(kula1_masatxt);
                add(btn);
                add(zmien_war1);
                
                add(kula2_tekst);
		add(kula2_rozmiar);
		add(kula2_sred);
		add(kula2_polozenie);
		add(kula2_x);
		add(kula2_xx);
		add(kula2_y);
		add(kula2_yy);
		add(kula2_wektor);
		add(kula2_wektordx);
		add(kula2_dx);
		add(kula2_wektordy);
		add(kula2_dy);
                add(kula2_masa);
                add(kula2_masatxt);
                add(btn2);
                add(zmien_war2);
                        
                add(kula3_tekst);
		add(kula3_rozmiar);
		add(kula3_sred);
		add(kula3_polozenie);
		add(kula3_x);
		add(kula3_xx);
		add(kula3_y);
		add(kula3_yy);
		add(kula3_wektor);
		add(kula3_wektordx);
		add(kula3_dx);
		add(kula3_wektordy);
		add(kula3_dy);
                add(kula3_masa);
                add(kula3_masatxt);
                add(btn3);
                add(zmien_war3);
               
                
                kula1_tekst.setBounds(5,0,45,40);
                kula1_rozmiar.setBounds(50,0,70,40);
                kula1_sred.setBounds(110,8,45,25);
                kula1_polozenie.setBounds(160,0,90,40);
                kula1_x.setBounds(230,0,35,40);
                kula1_xx.setBounds(250,8,25,25);
                kula1_y.setBounds(280,0,35,40);
                kula1_yy.setBounds(310,8,25,25);
                kula1_wektor.setBounds(5,40,100,40);
                kula1_wektordx.setBounds(115,40,30,40);
                kula1_dx.setBounds(150,45,25,25);
                kula1_wektordy.setBounds(190,40,40,40);
                kula1_masa.setBounds(260,40,40,40);
                kula1_masatxt.setBounds(300,45,35,25);
                kula1_dy.setBounds(220,45,25,25);
                btn.setBounds(270,90,120,30);
               zmien_war1.setBounds(150,90,120,30);
                
                kula2_tekst.setBounds(5,150,45,40);
                kula2_rozmiar.setBounds(50,150,70,40);
                kula2_sred.setBounds(110,158,45,25);
                kula2_polozenie.setBounds(160,150,90,40);
                kula2_x.setBounds(230,150,35,40);
                kula2_xx.setBounds(250,158,25,25);
                kula2_y.setBounds(280,150,35,40);
                kula2_yy.setBounds(310,158,25,25);
                kula2_wektor.setBounds(5,190,100,40);
                kula2_wektordx.setBounds(115,190,30,40);
                kula2_dx.setBounds(150,195,25,25);
                kula2_wektordy.setBounds(190,190,40,40);
                kula2_dy.setBounds(220,195,25,25);
                kula2_masa.setBounds(260,190,40,40);
                kula2_masatxt.setBounds(300,195,35,25);
                btn2.setBounds(270,240,120,30);
                zmien_war2.setBounds(150,240,120,30);
                
                kula3_tekst.setBounds(5,300,45,40);
                kula3_rozmiar.setBounds(50,300,70,40);
                kula3_sred.setBounds(110,308,45,25);
                kula3_polozenie.setBounds(160,300,90,40);
                kula3_x.setBounds(230,300,35,40);
                kula3_xx.setBounds(250,308,25,25);
                kula3_y.setBounds(280,300,35,40);
                kula3_yy.setBounds(310,308,25,25);
                kula3_wektor.setBounds(5,340,100,40);
                kula3_wektordx.setBounds(115,340,30,40);
                kula3_dx.setBounds(150,345,25,25);
                kula3_wektordy.setBounds(190,340,40,40);
                kula3_dy.setBounds(220,345,25,25);
                kula3_masa.setBounds(260,340,40,40);
                kula3_masatxt.setBounds(300,345,35,25);
                btn3.setBounds(270,390,120,30);
                zmien_war3.setBounds(150,390,120,30);
                        
                kula1_tekst.setForeground(Color.cyan);
                kula2_tekst.setForeground(Color.red);
                kula3_tekst.setForeground(Color.green);
                
                btn.addActionListener(new Zatrzymaj_1());
                btn2.addActionListener(new Zatrzymaj_2());
                btn3.addActionListener(new Zatrzymaj_3());
                zmien_war1.addActionListener(new Zmien1());
                zmien_war2.addActionListener(new Zmien2());
                zmien_war3.addActionListener(new Zmien3());
                
		setBorder(new LineBorder(Color.blue));
		
		
		
	}

public void setKulki(Kulka kul1, Kulka kul2, Kulka kul3){
    kula1_xx.setText(""+kul1.x);
    kula1_yy.setText(""+kul1.y);
    kula1_dx.setText(""+kul1.dx);
    kula1_dy.setText(""+kul1.dy);
    kula1_sred.setText(""+kul1.dim);
    kula1_masatxt.setText(""+kul1.masa);
    
    kula2_xx.setText(""+kul2.x);
    kula2_yy.setText(""+ kul2.y);
    kula2_dx.setText(""+kul2.dx);
    kula2_dy.setText(""+kul2.dy);
    kula2_sred.setText(""+kul2.dim);
    kula2_masatxt.setText(""+kul2.masa);
    
    kula3_xx.setText(""+kul3.x);
    kula3_yy.setText(""+ kul3.y);
    kula3_dx.setText(""+kul2.dx);
    kula3_dy.setText(""+kul2.dy);
    kula3_sred.setText(""+kul3.dim);
    kula3_masatxt.setText(""+kul3.masa);
    
}

public void setBasicAnim(BasicAnim ba){
    this.basicanim=ba;
    
}

public void setKulka(Kulka kul1, int i){
    if (i == 0){
    kula1_xx.setText(""+kul1.x);
    kula1_yy.setText(""+kul1.y);
    kula1_dx.setText(""+kul1.dx);
    kula1_dy.setText(""+kul1.dy);
    kula1_sred.setText(""+kul1.dim); 
    kula1_masatxt.setText(""+kul1.masa);
    } else  if (i == 1){
    kula2_xx.setText(""+kul1.x);
    kula2_yy.setText(""+kul1.y);
    kula2_dx.setText(""+kul1.dx);
    kula2_dy.setText(""+kul1.dy);
    kula2_sred.setText(""+kul1.dim);  
    kula2_masatxt.setText(""+kul1.masa);
    } else  if (i == 2){
    kula3_xx.setText(""+kul1.x);
    kula3_yy.setText(""+kul1.y);
    kula3_dx.setText(""+kul1.dx);
    kula3_dy.setText(""+kul1.dy);
    kula3_sred.setText(""+kul1.dim);  
    kula3_masatxt.setText(""+kul1.masa);
    } 
    
    
    
}


class Zatrzymaj_1 implements ActionListener {
   
    public void actionPerformed(ActionEvent e) {
       if (basicanim.kule[0].ruch==true) basicanim.kule[0].setRuch(false); else basicanim.kule[0].setRuch(true);
    }
}

class Zatrzymaj_2 implements ActionListener {
   
    public void actionPerformed(ActionEvent e) {
        if (basicanim.kule[1].ruch==true) basicanim.kule[1].setRuch(false); else basicanim.kule[1].setRuch(true);
    }
}

class Zatrzymaj_3 implements ActionListener {
   
    public void actionPerformed(ActionEvent e) {
        if (basicanim.kule[2].ruch==true) basicanim.kule[2].setRuch(false); else basicanim.kule[2].setRuch(true);
    }
}

class Zmien1 implements ActionListener {
   
    public void actionPerformed(ActionEvent e) {
       if (basicanim.kule[0].ruch==false){
          basicanim.kule[0].setX(Double.parseDouble(kula1_xx.getText()));
          basicanim.kule[0].setY(Double.parseDouble(kula1_yy.getText()));         
          basicanim.kule[0].setDX(Double.parseDouble(kula1_dx.getText()));          
          basicanim.kule[0].setDY(Double.parseDouble(kula1_dy.getText()));
          basicanim.kule[0].setMasa(Integer.parseInt(kula1_masatxt.getText()));
          basicanim.kule[0].setDim(Integer.parseInt(kula1_sred.getText()));         
       } }
}
class Zmien2 implements ActionListener {
   
    public void actionPerformed(ActionEvent e) {
       if (basicanim.kule[1].ruch==false){
          basicanim.kule[1].setX(Double.parseDouble(kula2_xx.getText()));
          basicanim.kule[1].setY(Double.parseDouble(kula2_yy.getText()));         
          basicanim.kule[1].setDX(Double.parseDouble(kula2_dx.getText()));          
          basicanim.kule[1].setDY(Double.parseDouble(kula2_dy.getText()));
          basicanim.kule[1].setMasa(Integer.parseInt(kula2_masatxt.getText()));
          basicanim.kule[1].setDim(Integer.parseInt(kula2_sred.getText()));         
       } }
}

class Zmien3 implements ActionListener {
   
    public void actionPerformed(ActionEvent e) {
       if (basicanim.kule[2].ruch==false){
          basicanim.kule[2].setX(Double.parseDouble(kula3_xx.getText()));
          basicanim.kule[2].setY(Double.parseDouble(kula3_yy.getText()));         
          basicanim.kule[2].setDX(Double.parseDouble(kula3_dx.getText()));          
          basicanim.kule[2].setDY(Double.parseDouble(kula3_dy.getText()));
          basicanim.kule[2].setMasa(Integer.parseInt(kula3_masatxt.getText()));
          basicanim.kule[2].setDim(Integer.parseInt(kula3_sred.getText()));         
       } }
}


}




