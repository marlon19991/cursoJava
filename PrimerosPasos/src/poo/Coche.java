package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas=40;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}
	
	public String dime_datos_generales() { //getter
		
		return "La paltaforma del vehiculo tiene "+ ruedas+" ruedas, mide " + largo/1000 + " metros con un nacho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";
	}
	
	public void establece_color(String color_coche) { //setter
		
		//color="azul";
		
		color=color_coche;
		
	}
	
	public String dime_color() {
		
		return "EL color del coche es "+ color;
	}
	
	
	public void configura_asientos(String asientos_cuero) {//setter
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos(){//getter
		
		if (asientos_cuero==true) {
		
			return "El coche tiene asientos de cuero";
	}else {
		return "El coche tiene asientos de serie";
		}
	}
	
	public void configura_climatizador(String climatizador) { //setter
		
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() {
		if(climatizador==true) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche llava aire acondicionador";
		}
	}
	
	public String dime_peso_coche() { //setter + getter
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
		return "El peso del coche es " + peso_total + " kg";
	}
	
	public int precio_coche() { //getter
		int precio_final=10000;
		if (asientos_cuero==true) {
			precio_final+=2000;
		}
		if (climatizador==true) {
			precio_final+=1500;
		}
		return precio_final;
	}
	
	

}
