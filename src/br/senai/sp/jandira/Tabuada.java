package br.senai.sp.jandira;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int multiplicando, multiplicadorMenor, multiplicadorMaior, maior, menor, tabuada;
		
		System.out.println("**************************");
		System.out.println("         TABUADA");
		System.out.println("**************************");
		System.out.println("");
		
		System.out.println("Qual o multiplicando?");
		multiplicando = teclado.nextInt();
		
		System.out.println("Qual o mínimo multiplicador?");
		multiplicadorMenor = teclado.nextInt();
		
		System.out.println("Qual o maior multiplicador?");
		multiplicadorMaior = teclado.nextInt();
		

		if (multiplicadorMenor < multiplicadorMaior) {
			maior = multiplicadorMaior;
			menor = multiplicadorMenor;
		} else {
			maior = multiplicadorMenor;
			menor = multiplicadorMaior;
		}
		
		System.out.println("");
		System.out.println("TABUADA DO " + multiplicando);
		System.out.println("-----------------------------");
		System.out.println("");
		
		while(maior > menor) {
			
			tabuada = multiplicando * menor;
			System.out.println(multiplicando + " x " + menor + " = " + tabuada);
			menor++;
			
		}
		
		System.out.println(multiplicando + " x " + maior + " = " + multiplicando * maior);
		
	}

}
