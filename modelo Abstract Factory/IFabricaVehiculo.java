package modelo;

public interface IFabricaVehiculo {
	Automovil crearAutomovil (String modelo, String color, int potencia, double espacio);
	Scooter crearScooter (String modelo, String color, int potencia);
}
