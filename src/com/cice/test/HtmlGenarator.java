package com.cice.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;


public class HtmlGenarator {
	private static BufferedReader plantilla;

	public static void loadPlantilla() {
		try {
			plantilla = new BufferedReader(new FileReader("C:/VideJuegos/plantilla.html"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void printHtlm(Videojuego v) {
		String line  = "";
		loadPlantilla();
		//  TRY-CATCH RESURCE
		try (BufferedWriter outputStream = new BufferedWriter(
				new FileWriter("C:/VideJuegos/"+v.getTitulo() +".html"))){

			while((line = plantilla.readLine()) !=null) {
				if (line.contains("${Titulo}"))line=line.replace("${Titulo}", v.getTitulo());
				if (line.contains("${Plataforma}"))line=line.replace("${Plataforma}", v.getPlataforma());
				if (line.contains("${Precio}"))line = line.replace("${Precio}", String.valueOf(v.getPrecio()));
				System.out.println(line);
				outputStream.write(line);
			}
		} catch (IOException e1) {

			e1.printStackTrace();
		}finally {
			try {
				plantilla.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
	
	public static void printJSON(Videojuego v) {
		
		try (BufferedWriter outputStream = new BufferedWriter(
				new FileWriter("C:/VideJuegos/"+v.getTitulo() +".json"))){
				new JSONObject(v).write(outputStream);
				
		} catch (IOException | JSONException e) {
			
			e.printStackTrace();	
		}
	}
}
