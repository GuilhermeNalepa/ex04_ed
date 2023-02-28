package controller;

public class InverteController {
	
	public InverteController() {
		
		super();
		
	}
	
	public String inverte(String caracteres, int tamanho) {
		
		//Condição de parada
		if (tamanho == 0) {
			
			return "";
			//Quando tamanho for igual a 0, retorna espaço vazio
			
		} else {
			
			int ultimaPosicao = tamanho - 1;
			String inversao = caracteres.substring(ultimaPosicao, tamanho);
			tamanho = tamanho - 1;
			return inversao + inverte(caracteres, tamanho);
			//Retorno é feito somando inversão, que contém a letra entre
			//ultimaPosicao e tamanho, com a chamada da função 
			
		}
		
	}
	
}