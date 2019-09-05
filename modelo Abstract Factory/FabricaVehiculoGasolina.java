package modelo;

public class FabricaVehiculoGasolina implements IFabricaVehiculo {
	public Automovil crearAutomovil (String modelo, String color, int potencia, double espacio){
	return new AutomovilGasolina(modelo, color, potencia, espacio);
	}
	public Scooter crearScooter (String modelo, String color, int potencia){
	return new ScooterGasolina(modelo, color, potencia);
	}
}
