package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuentes mimarco = new MarcoConFuentes();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoConFuentes extends JFrame {
	
	public MarcoConFuentes(){
	
	setTitle ("Prueba de fuentes");
	setSize (400,400);
	
	LaminaConFuentes milamina = new LaminaConFuentes();
	add(milamina);
	
	milamina.setForeground(Color.BLUE);
	
	
	}
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente = new Font ("Arial", Font.BOLD, 26);
		
		g2.setFont(mifuente);		
		//g2.setColor(Color.RED);		
		g2.drawString("Marlon", 100, 100);
		
		g2.setFont(new Font("Italic", Font.ITALIC, 20));		
		//g2.setColor(new Color(120,230,90).darker());
		g2.drawString("Yela", 100, 200);
		
		
		
	}
}
