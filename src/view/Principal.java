package view;

import controller.InverteController;

public class Principal {

	public static void main(String[] args) {
		
		InverteController ic = new InverteController();
		String caracteres = "desenvolvimento";
		int tamanho = caracteres.length();

		String inverte = ic.inverte(caracteres, tamanho);
		System.out.println(inverte);

	}

}