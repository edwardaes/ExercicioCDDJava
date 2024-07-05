package Exercicio;

public class exercicio07 {

	public static void main(String[] args) {
		String palavras [] = {"a", "vida", "é", "bela"};
		StringBuilder resultado = new StringBuilder();
		
		for(int x = palavras.length -1; x >= 0; x--) {
			resultado.append(palavras[x]).append(" ");
		}
		String textoM = resultado.toString().toUpperCase().trim();
		System.out.println(textoM);

	}

}
