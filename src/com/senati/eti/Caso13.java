package com.senati.eti;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre.....: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese apellido...: ");
		String apellido = sc.nextLine();
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Alumno....: " + nombre.toUpperCase() + " " + apellido.toUpperCase());
	}

}
