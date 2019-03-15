
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Esteban";
		
		System.out.println("Mi nombre es "+ nombre);
		
		System.out.println("Mi nombre tiene "+ nombre.length() + " Letras");
		
		System.out.println("La primera letra de "+ nombre + " Es la " + nombre.charAt(0) );
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("Y la última letra es la "+ nombre.charAt(ultima_letra-1));

	}

}
