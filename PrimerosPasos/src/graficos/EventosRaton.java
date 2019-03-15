package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton mimarco =new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton(){
	
	setVisible(true);
	setBounds(500,150,600,450);
	EventosDeRaton eventoraton=new EventosDeRaton();
	addMouseMotionListener(eventoraton);
	}
	
}

class EventosDeRaton implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estás arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estás moviendo");
	}

	
	/*public void mouseClicked(MouseEvent e) {
		//System.out.println("Coordenada X: "+ e.getX() + " Coordenada Y: " + e.getY());
		System.out.println("Ha hecho: " + e.getClickCount()+ " clicks");
		
	}*/
	
	/*public void mousePressed(MouseEvent e) {
		
		if (e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK ){
			System.out.println("Has pulsado el botón izquierdo");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
			System.out.println("Has pulsado la rueda del ratón");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el botón derecho");
		}
	}*/
	
	
	
}