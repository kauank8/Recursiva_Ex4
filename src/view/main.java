package view;

import java.util.Random;

import controller.NegativoController;

public class main {

	public static void main(String[] args) {
		Random gerador = new Random();
		int vt[] = new int[gerador.nextInt(5)+1];
		int tamanho = vt.length;
		for(int i =0; i<tamanho;i++) {
			vt[i]=gerador.nextInt(21)-10;
			System.out.print(vt[i]+",");
		}
		NegativoController n = new NegativoController();
		int negativo=0;
		negativo = n.calculaNegativo(vt, tamanho,negativo);
		System.out.println("\nNumero de negativos:"+ negativo);
	

	}

}
