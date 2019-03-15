package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2=new Empleados("Ana");
		Empleados trabajador3=new Empleados("Antonio");
		Empleados trabajador4=new Empleados("María");
		
		trabajador1.cambia_seccion("RRHH");
		/*trabajador1.cambia_nombre("María");*/
		
		
		
		System.out.println(trabajador1.devuelve_dato() + "\n" + trabajador2.devuelve_dato() + "\n" + trabajador3.devuelve_dato() + "\n" + trabajador4.devuelve_dato());
				
		System.out.println(Empleados.dame_id_siguiente());
		
		/*System.out.println(trabajador2.devuelve_dato());
				
		System.out.println(trabajador3.devuelve_dato());
		
		System.out.println(trabajador4.devuelve_dato());*/

	}

}


class Empleados{  //constructor
	
	public Empleados(String nom) {
		
		nombre=nom;
		seccion="Administración";
		id=id_siguiente;
		id_siguiente++;
		
		
	}
	
	public void cambia_seccion(String seccion) { //setter establece un valor en un campo
		
		this.seccion=seccion;
		
	}
	
	/*public void cambia_nombre(String nombre) {
		
		this.nombre=nombre;
	}*/
	
	public String devuelve_dato() {
		
		return "El nombre es: "	 + nombre + " la sección es: " + seccion + " y el ID es " + id;
	}
	
	
	public static String dame_id_siguiente() {
		
		return "El ID siguiente es: " + id_siguiente;
	}
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int id_siguiente=1;
}
