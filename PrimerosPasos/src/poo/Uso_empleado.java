package poo;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		Empleado empleado2=new Empleado("Ana López", 95000, 1995, 06, 02);
		Empleado empleado3=new Empleado("María Martín", 105000, 2001, 03, 15);

		empleado1.sube_sueldo(5);
		empleado2.sube_sueldo(5);
		empleado3.sube_sueldo(5);
		
		System.out.println("Nombre : " + empleado1.dame_nombre()+ " sueldo "+ empleado1.dame_sueldo()
		+ " fecha de alta "+ empleado1.dame_fecha_contrato());
		
		System.out.println("Nombre : " + empleado2.dame_nombre()+ " sueldo "+ empleado2.dame_sueldo()
		+ " fecha de alta "+ empleado2.dame_fecha_contrato());
		
		System.out.println("Nombre : " + empleado3.dame_nombre()+ " sueldo "+ empleado3.dame_sueldo()
		+ " fecha de alta "+ empleado3.dame_fecha_contrato());*/
		
		
		
		/*for(int i=0;i<3;i++) {
			mis_empleados[i].sube_sueldo(5);
		}*/
		
		/*for(int i=0;i<3;i++) {
			System.out.println("Nombre: "+ mis_empleados[i].dame_nombre()+
					" sueldo " + mis_empleados[i].dame_sueldo() +  
					" fecha de alta "+ mis_empleados[i].dame_fecha_contrato());*/
		
		Jefatura jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.establece_incentivo(2570);
		
		Empleado[]mis_empleados=new Empleado[6];
		mis_empleados[0]=new Empleado("Paco Gómez", 25000, 2005, 9, 25);
		mis_empleados[1]=new Empleado("Ana López", 30000, 2000, 07, 07);
		mis_empleados[2]=new Empleado("Carlos Martín", 50000, 1995, 16, 15);
		mis_empleados[3]=new Empleado("Antonio Fernandez", 47500, 2009, 11, 9);
		mis_empleados[4]=jefe_RRHH; //polimorfismo en acción, pricipio de sustitución
		mis_empleados[5]=new Jefatura("Maria", 95000, 1999, 5, 26);
		Jefatura jefa_finanzas=(Jefatura) mis_empleados[5];
		jefa_finanzas.establece_incentivo(55000);
		
		System.out.println(jefa_finanzas.tomar_decisiones("Dar mas días de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_finanzas.dame_nombre() + " tiene un bonus de " + jefa_finanzas.establece_bonus(500));
		
		System.out.println(mis_empleados[3].dame_nombre() + " tiene un bonus de: " + mis_empleados[3].establece_bonus(200));
		/*Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05, 05);
		
		Comparable ejemplo= new Empleado("Elizabeth", 95000, 2011, 06, 07);
		
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		
		if(ejemplo instanceof Empleado) {
			System.out.println("Implementa la interfaz comparable");
		}*/
		
		for(Empleado e: mis_empleados) {
			e.sube_sueldo(5);
		}
		
		Arrays.sort(mis_empleados);
		
		for (Empleado e: mis_empleados) {
			System.out.println("Nombre: "+ e.dame_nombre()+
					" sueldo " + e.dame_sueldo() +  
					" fecha de alta "+ e.dame_fecha_contrato());
		
		}
		
	}

}


class Empleado	implements Comparable, Trabajadores {
	
	public Empleado (String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		alta_contrato=calendario.getTime();
		id=id_siguiente;
		id_siguiente++;
	}
	
	public double establece_bonus (double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	public Empleado(String nom) { //sobrecarga de constructores
		this(nom, 30000,2000,01,01);
	}
	
	public String dame_nombre(){ //getter
		return nombre + " id:" + id;
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
	
	public int compareTo (Object miObjeto) {
		
		Empleado otro_empleado = (Empleado) miObjeto;
		
		if(this.id<otro_empleado.id) {
			return -1;
		}
		
		if(this.id>otro_empleado.id) {
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date alta_contrato;
	private int id;
	private static int id_siguiente=1;
}

class Jefatura extends Empleado implements Jefes {
	
public Jefatura (String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
	}

public String tomar_decisiones(String decision) {
	
	return "Un miembro de la dirección a tomado la decisión de: " + decision;
}

public double establece_bonus (double gratificacion) {
	
	double prima=2000;
	
	return Trabajadores.bonus_base + gratificacion + prima;
}
	
	public void establece_incentivo(double b) { //setter
		
		incentivo=b;		
	}
	
	public double dame_sueldo() { //getter
		
		double sueldo_jefe = super.dame_sueldo();
		return sueldo_jefe + incentivo;
		}
	
	private double incentivo;
	
}
