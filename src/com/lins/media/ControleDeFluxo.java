package com.lins.media;

import java.util.Scanner;

public class ControleDeFluxo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        double[] notas = new double[4];

	      
	        for (int i = 0; i < 4; i++) {
	            System.out.print("Digit a nota " + (i + 1) + ": ");
	            notas[i] = scanner.nextDouble();
	        }

	       
	        double soma = 0;
	        for (double nota : notas) {
	            soma += nota;
	        }
	        double media = soma / notas.length;

	        System.out.println("média do aluno é : " + media);

	        if (media < 5) {
	            System.out.println("Aluno reprovado");
	        } else if (media >= 5 && media < 7) {
	            System.out.println("Aluno em recuperação");
	        } else {
	            System.out.println("Aluno aprovado");
	        }

	        scanner.close();
	    }
	}