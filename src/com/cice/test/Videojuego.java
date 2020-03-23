package com.cice.test;

import java.io.Serializable;

public class Videojuego implements Serializable {

	private String titulo;
	private String plataforma;
	private double precio;

	public Videojuego() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Videojuego(String titulo, String plataforma, double precio) {
		super();
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", plataforma=" + plataforma + ", Precio=" + precio + "]";
	}

}
