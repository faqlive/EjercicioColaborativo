package com.cice.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GestorPersistencia {
	
	private static String url = "C:/VideJuegos/almacen"; 
	// METODO DE APOYO PARA CREAR RUTA
	public static void crearDirectorio(String url) {
	        File carpeta = new File(url);
	        if (!carpeta.exists()) {
	            carpeta.mkdirs();
	        }
	}

	public static void almacenarVideojuego(Videojuego v) {
		// Tomamos el nombre del video juego para crear la ruta de almacenaje
		String fileName = url + "/" + v.getTitulo() + ".data";
		// Crear el directorio si hace falta.
		GestorPersistencia.crearDirectorio(url);
		// Escribir el objeto.
		FileOutputStream dat = null;
		ObjectOutputStream vdat = null;
		try  {
			dat = new FileOutputStream(fileName);
			vdat = new ObjectOutputStream(dat);
			vdat.writeObject(v);
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		} catch (Exception e) {

		}finally {
			try {
				dat.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		

	}
	
	public static void recuperarVideojuesto(String titulo) {
		String fileName = url + "/" + titulo + ".data";
		Videojuego v = new Videojuego();
		ObjectInputStream obj = null;
		try {
			obj = new ObjectInputStream(new FileInputStream(fileName));
			v = (Videojuego) obj.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ClassNotFoundException cnfe){
			
		}finally {
			try {
				obj.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		System.out.println(v.toString());
		
	}
}
