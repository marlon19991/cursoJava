package poo;


import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class Prueba_temportizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mi_reloj= new Reloj();
		
		mi_reloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);

	}

}


class Reloj {
	
	
	
	public void enMarcha( int intervalo, final boolean sonido) {
		
		class Dame_la_hora2 implements ActionListener{
			
			public void actionPerformed (ActionEvent evento) {
				
				Date ahora= new Date();
				
				System.out.println("Te pongo la hora cada 3 segundos" + ahora);
				
				if (sonido) {
					
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		
		ActionListener oyente= new Dame_la_hora2();
		Timer mi_temporizador= new Timer(intervalo, oyente);
		mi_temporizador.start();
	}
	
	
	
	
}
