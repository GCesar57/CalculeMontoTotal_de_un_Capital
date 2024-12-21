package com.ejercicio9;

import java.util.Scanner;

public class Calcular_MontoTotalCapital {

	public static void main(String[] args) {
		//Construya un algoritmo que calcule el monto total de una capital
		// según sea el capital ingresado inicialmente y la tasa de interés
		Scanner entrada = new Scanner(System.in);
		double capital, interes, monto;
		System.out.println("Ingrese el capital: ");
		capital = entrada.nextDouble();
		System.out.println("Ingrese la tasa de interes: ");
		interes = entrada.nextDouble();
		//
		monto = capital*(1+(interes/100));
		System.out.println("El monto es: "+monto);
		
	}

}
