package modelo;

public class FabricaVehiculoElectricidad implements IFabricaVehiculo {
	public Automovil crearAutomovil (String modelo, String color, int potencia, double espacio){
	return new AutomovilElectricidad(modelo, color, potencia, espacio);
	}
	public Scooter crearScooter (String modelo, String color, int potencia){
	return new ScooterElectricidad(modelo, color, potencia);
	}
}
