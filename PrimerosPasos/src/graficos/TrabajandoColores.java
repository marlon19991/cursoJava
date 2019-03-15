package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor mimarco = new MarcoConColor();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoConColor extends JFrame {
	
	public MarcoConColor(){
	
	setTitle ("Prueba de dibujo");
	setSize (400,400);
	
	LaminaConColor milamina = new LaminaConColor();
	add(milamina);
	
	milamina.setBackground(SystemColor.window);
	
	}
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		Graphics2D g2=(Graphics2D) g;
		g2.setPaint(Color.BLUE);
		g2.draw(rectangulo);
		g2.setPaint(Color.RED);
		g2.fill(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		Color micolor= new Color(155,174,25);
		g2.setPaint(micolor);
		g2.fill(elipse);
		
				
		
	}
}