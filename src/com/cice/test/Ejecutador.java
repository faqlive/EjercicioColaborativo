package com.cice.test;

public class Ejecutador {
	
	public static void main(String[] args) {
		
		Videojuego cod = new Videojuego("CallOfDuty","XBox",30);
		
		GestorPersistencia.almacenarVideojuego(cod);
		
		GestorPersistencia.recuperarVideojuesto("CallOfDuty");
		
		HtmlGenarator.printHtlm(cod);
		HtmlGenarator.printJSON(cod);
	}

}
