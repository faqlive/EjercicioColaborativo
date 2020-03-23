package com.cice.test;

import java.util.Scanner;

public class Ejecutador {
	
	public static void main(String[] args) {
		
		/*Videojuego cod = new Videojuego("CallOfDuty","XBox",30);
		
		GestorPersistencia.almacenarVideojuego(cod);
		
		GestorPersistencia.recuperarVideojuesto("CallOfDuty");
		
		HtmlGenarator.printHtlm(cod);
		HtmlGenarator.printJSON(cod);*/
		
	//SE ME OCURRE PEDIR VIDEJUEGOS POR TECLADO	
	//podemos hacer un bucle while hasta que se escriba un 0 y se salga del bucle?	
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca titulo");
		String titulo= sc.nextLine();
		System.out.println("Introduzca plataforma");
		String plataforma=sc.nextLine();
		System.out.println("Introduzca precio");
		double precio= sc.nextDouble();
		
		
		Videojuego videogame = new Videojuego(titulo, plataforma, precio);
		GestorPersistencia.almacenarVideojuego(videogame);
		HTML_Generator.printHtlm(videogame);
		sc.close();
		
	}

}
