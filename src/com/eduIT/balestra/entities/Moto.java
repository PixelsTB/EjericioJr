package com.eduIT.balestra.entities;

import java.text.DecimalFormat;

public class Moto extends Vehiculo {

	private String cilindrada;

	public Moto(String marca, String modelo, Double precio) {
		super(marca, modelo, precio);
	}

	public Moto(String marca, String modelo, Double precio, String cilindrada) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###.00");
		return "Marca: " + getMarca() + " // Modelo: " + getModelo() + " // Cilindrada: " + cilindrada + " // Precio: $"
				+ df.format(getPrecio());
	}

}
