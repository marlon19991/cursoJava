package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import javax.imageio.*;
import java.io.*;


public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen mimarco = new MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoImagen extends JFrame {
	
	public MarcoImagen(){
	
	setTitle ("Marco con imagen");
	setBounds (10,10,1000,700);
	
	LaminaConImagen milamina = new LaminaConImagen();
	add(milamina);
	
	
	
	
	}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		
		try {
			imagen=ImageIO.read(new File ("src/graficos/23.jpg"));
		}
		catch (IOException e) {
			System.out.println("La imagen no se encuentra");
			}
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//File miimagen= new File("src/graficos/23.jpg");
		
		int anchoImagen=imagen.getWidth(this);
		int altoImagen=imagen.getHeight(this);
				
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0;i<1000;i++) {
			for(int j=0;j<700;j++) {
				if(i+j>0) {
				g.copyArea(0, 0, 225, 225, anchoImagen*i, altoImagen*j);
			}
		}
		}
	}
	
	private Image imagen;
}
