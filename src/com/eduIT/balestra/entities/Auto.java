package com.eduIT.balestra.entities;

import java.text.DecimalFormat;

public class Auto extends Vehiculo {

	private String puertas;

	public Auto(String marca, String modelo, Double precio, String puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public Auto(String marca, String modelo, Double precio) {
		super(marca, modelo, precio);
	}

	public String getPuertas() {
		return puertas;
	}

	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###.00");
		return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Puertas: " + puertas + " // Precio: $" + df.format(getPrecio());
	}

}
