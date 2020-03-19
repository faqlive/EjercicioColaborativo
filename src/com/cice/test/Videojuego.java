package com.cice.test;

public class Videojuego {

	private String titulo;
	private String plataforma;
	private double Precio;
	public Videojuego() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Videojuego(String titulo, String plataforma, double precio) {
		super();
		this.titulo = titulo;
		this.plataforma = plataforma;
		Precio = precio;
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
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	
}
