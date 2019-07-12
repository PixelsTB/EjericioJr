package com.eduIT.balestra;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.eduIT.balestra.entities.Auto;
import com.eduIT.balestra.entities.Vehiculo;

public class Test {
	
	static List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,###.00");

		cargarVehiculos();

		vehiculos.forEach(System.out::println);

		System.out.println("========================");
		
		Vehiculo vMax = vehiculos.stream().max(Comparator.comparing(Vehiculo::getPrecio)).get();
		System.out.println("Vehículo mas caro: " + vMax.getMarca() + " " + vMax.getModelo());
		
		Vehiculo vMin = vehiculos.stream().min(Comparator.comparing(Vehiculo::getPrecio)).get();
		System.out.println("Vehículo mas barato: " + vMin.getMarca() + " " + vMin.getModelo());
		
		List<Vehiculo> vehiculosY = vehiculos.stream().filter(v -> v.getModelo().contains("Y")).collect(Collectors.toList());
		vehiculosY.stream().forEach(v -> System.out.println("Vehículo que contiene en el modelo la letra ‘Y’:" + v.getMarca() + " " + v.getModelo() + " " + df.format(v.getPrecio())));
		
		System.out.println("========================");

		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		vehiculos.stream().sorted(Comparator.comparing(Vehiculo::getPrecio)).collect(Collectors.toList())
				.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));

	}
	
	private static void cargarVehiculos() {
		Vehiculo v1 = new Auto("Peugeot", "206", 200000D, "4");
		Vehiculo v2 = new Auto("Honda", "Titan", 60000D, "125C");
		Vehiculo v3 = new Auto("Peugeot", "208", 250000D, "5");
		Vehiculo v4 = new Auto("Yamaha", "YBR", 80500.50, "160C");
		vehiculos.add(v1);
		vehiculos.add(v2);
		vehiculos.add(v3);
		vehiculos.add(v4);
	}
}
