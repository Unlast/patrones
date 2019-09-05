package modelo;

public class AutomovilElectricidad extends Automovil{
	public AutomovilElectricidad(String modelo, String color, int potencia, double espacio)
	{ 
		super (modelo, color, potencia, espacio);
	}
	
	public void MostrarCaracteristicas(){
		System.out.println("Automovil electrico de modelo:" + modelo+ "de color: "  + color +"de potencia" + potencia + "de espacio: " + espacio);
	}

	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		
	}
}
