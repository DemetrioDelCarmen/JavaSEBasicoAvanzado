package com.anncode.util;

import java.util.Scanner;
	/**
	 * 	<h1>AmazonUtil</h1>
	 * 
	 * 	<p>Clase que contiene un método para  validar las peticiones 
	 * 	de películas que quiere el usuario, principalmente trabaja sobre
	 * 	rango</p>
	 * 
	 *  <br>
	 *  @author Demetrio Del Carmen
	 *  @version 1.1
	 *  @since 2019
	 * 
	 * */
public class AmazonUtil {
	/**
	 * 	{@code validateUserResponseMenu} es un método que valida si la respuesta
	 * 	del usuario está en el rango de las películas que tiene el sistema.
	 * 
	 *  <h3> Parámetros que recibe</h3>
	 * 	@param min es el número mínimo para comenzar a buscar.
	 *  @param max es el número máximo al que puede llegar la búsqueda
	 *  	Osea las películas que tiene el sistema, para validar que esté en el rango.
	 *  
	 *  @return Devuelve un entero siendo este el número que ingresó
	 * 
	 * 
	 * */
	public static int validateUserResponseMenu(int min, int max) {
		//Leer la respuesta del usuario
		Scanner sc = new Scanner(System.in);
		
		//Validar respuesta int
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("No ingresaste una opciÃ³n vÃ¡lida1");
			System.out.println("Intenta otra vez1");
		}
		
		int response = sc.nextInt();
		
		//Validar rango de respuesta
		while(response < min || response > max) {
			//Solicitar de nuevo la respuesta
			System.out.println("No ingresaste una opciÃ³n vÃ¡lida");
			System.out.println("Intenta otra vez");
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("No ingresaste una opciÃ³n vÃ¡lida");
				System.out.println("Intenta otra vez");
			}
			response = sc.nextInt();
		}
		System.out.println("Tu Respuesta fue: " + response + "\n");
		return response;
	}

}
