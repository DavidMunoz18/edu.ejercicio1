package edu.ejercicio1;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa nota");
		
		int nota = sc.nextInt();
		System.out.println("Ingresa edad");
		int edad = sc.nextInt();
		System.out.println("Ingresa sexo");
		String sexo = sc.next();
		
		if(nota > 4 & edad > 17 & sexo.equals("M")) {
			
			System.out.println("Posible");
		}
		else if(nota> 4 & edad > 17 & sexo.equals("F")){
			System.out.println("Aceptada");
		}
		else {
			System.out.println("No aceptada");
		}
	}

}
