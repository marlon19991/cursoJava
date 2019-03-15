package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribienEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto mimarco =new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto() {
		
		setVisible(true);
		setSize(600, 400);
		setLocation(400, 200);
		setTitle("Primer texto");
		
		Lamina milamina = new Lamina();
		add(milamina);
	}
}

class Lamina extends JPanel {
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
	
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}
