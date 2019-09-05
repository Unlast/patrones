package test;
import java.util.*;
import modelo.*;
public class Test {
	public static int nAutos=3;
	public static int nScooters=2;
	
	public static void main (String [] args){
		Scanner reader = new Scanner (System.in);
		IFabricaVehiculo fabrica;
		int i;
		Automovil[] autos = new Automovil[nAutos];
		Scooter[] scooters = new Scooter[nScooters];
		System.out.print(" Desea utilizar " + " vehiculos electricos (1) o gasolina (2):");
		int  eleccion = reader.nextInt();
		if (eleccion==1){
			fabrica = new FabricaVehiculoElectricidad();
		}
		else 
		{
			fabrica = new FabricaVehiculoGasolina();	
		}
		for (i = 0; i < nAutos; i++)
			autos[i] = fabrica.crearAutomovil("estandar","amarillo", 6+i,3.2);
		for (i = 0; i < nScooters; i++)
			scooters[i] = fabrica.crearScooter("clasico","rojo", 2+i);
		for (Automovil auto: autos)
			auto.mostrarCaracteristicas();
		for (Scooter scooter: scooters)
			scooter.mostrarCaracteristicas();
	
	}
}



