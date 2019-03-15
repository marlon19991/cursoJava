package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] las_personas=new Persona [2];
		
		las_personas[0]= new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		las_personas[1]= new Alumno("Ana López", "Biológicas");
		
		for (Persona p: las_personas) {
			
			System.out.println(p.dame_nombre() + ", " +
					p.dame_descripcion());
		}

	}

}

abstract class Persona{
	
	public Persona(String nom) {
		
		nombre=nom;
	}
	
	public String dame_nombre() { //getter, método
		
		return nombre;
	}
	
	public abstract String dame_descripcion();
	
	private String nombre;
	
}


class Empleado2 extends Persona {
	
	public Empleado2 (String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		
		
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		alta_contrato=calendario.getTime();
		id=id_siguiente;
		id_siguiente++;
	}
	
	public String dame_descripcion(){
		
		return "Este empleado tiene un id= " + id + " con un sueldo de " + sueldo;
	}
	
		
	public double dame_sueldo() { //getter
		return sueldo;
	}
	
	public Date dame_fecha_contrato(){ //getter
		return alta_contrato;
	}
	
	public void sube_sueldo(double porcentaje) { //setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	

	private double sueldo;
	private Date alta_contrato;
	private int id;
	private static int id_siguiente=1;
}


class Alumno extends Persona {
	
	public Alumno (String nom, String car) {
		
		super(nom);
		carrera=car;
	}
	
public String dame_descripcion(){
		
		return "Este alumno está estudiando la carrera de " + carrera;
	}
	
	private String carrera;
}

