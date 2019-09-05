package modelo;

public class ScooterElectricidad extends Scooter{
	public ScooterElectricidad(String modelo, String color, int potencia)
	{ 
		super (modelo, color, potencia);
	}

	public void MostrarCaracteristicas(){
		System.out.println("Scooter electrico de modelo:" + modelo+ "de color: "  + color +"de potencia" + potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		
	}
}

