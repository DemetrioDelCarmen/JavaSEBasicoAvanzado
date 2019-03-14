package com.anncode.util;

import java.util.Scanner;
	/**
	 * 	<h1>AmazonUtil</h1>
	 * 
	 * 	<p>Clase que contiene un m�todo para  validar las peticiones 
	 * 	de pel�culas que quiere el usuario, principalmente trabaja sobre
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
	 * 	{@code validateUserResponseMenu} es un m�todo que valida si la respuesta
	 * 	del usuario est� en el rango de las pel�culas que tiene el sistema.
	 * 
	 *  <h3> Par�metros que recibe</h3>
	 * 	@param min es el n�mero m�nimo para comenzar a buscar.
	 *  @param max es el n�mero m�ximo al que puede llegar la b�squeda
	 *  	Osea las pel�culas que tiene el sistema, para validar que est� en el rango.
	 *  
	 *  @return Devuelve un entero siendo este el n�mero que ingres�
	 * 
	 * 
	 * */
	public static int validateUserResponseMenu(int min, int max) {
		//Leer la respuesta del usuario
		Scanner sc = new Scanner(System.in);
		
		//Validar respuesta int
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("No ingresaste una opción válida1");
			System.out.println("Intenta otra vez1");
		}
		
		int response = sc.nextInt();
		
		//Validar rango de respuesta
		while(response < min || response > max) {
			//Solicitar de nuevo la respuesta
			System.out.println("No ingresaste una opción válida");
			System.out.println("Intenta otra vez");
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("No ingresaste una opción válida");
				System.out.println("Intenta otra vez");
			}
			response = sc.nextInt();
		}
		System.out.println("Tu Respuesta fue: " + response + "\n");
		return response;
	}

}
