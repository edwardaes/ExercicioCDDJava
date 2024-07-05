package Exercicio;

public class Exercicio06 {

	public static void main(String[] args) {
		String palavras [] = {"a", "vida", "é", "bela"};
		StringBuilder resultado = new StringBuilder();
		
		for(int x = 0; x < palavras.length; x++) {
			resultado.append(palavras[x]).append(" ");
		}
		String textoM = resultado.toString().toUpperCase().trim();
		System.out.println(textoM);
	}

}
