
public class manipula_cadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		
		int ultima_letra=frase.length();
		
		//String frase_resumen=frase.substring(29, frase.length()) + " irnos a la playa y olvidarnos de todo...";
		
		String frase_resumen=frase.substring(0, 28) + " irnos a la playa, olvidarnos de todo" + 
		" y " +	frase.substring(29, ultima_letra);
		
		System.out.println(frase_resumen);

	}

}
