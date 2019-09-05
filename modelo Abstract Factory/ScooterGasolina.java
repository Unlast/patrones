package modelo;

public class ScooterGasolina extends Scooter{
	public ScooterGasolina (String modelo, String color, int potencia)
	{
		super(modelo, color, potencia);
	}
	public void MostrarCaracteristicas(){
		System.out.println("Scooter de gasolina de modelo:" + modelo+ "de color: "  + color +"de potencia" + potencia);
	}
	@Override
	public void mostrarCaracteristicas() {
		// TODO Auto-generated method stub
		
	}
}
