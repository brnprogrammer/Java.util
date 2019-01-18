package br.com.main;

public class TesteString {
	public static void main(String[] args) {
		String vazio = " Teste ";
		System.out.println(vazio.contains("Tes"));//verifica se essa string existe na variavel vazio
		String xd = vazio.trim(); // metodo que remove espaços em branco dentro de uma string
		
		System.out.println(xd.isEmpty());
		
		String nome = "Brun1o";
		// uma string criada nao pode ser alterada  IMUTABILIDADE
		
		System.out.println(nome.length());
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
		int pos = nome.indexOf("1o");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		char c = nome.charAt(2);
		System.out.println(c);
		//Imprimi o caracter na posicao definida
		
		
		String outro = nome.replace("1", "ABC");
		// Caracter selecionado e caracter a ser setado
		// String outro = nome.toUpperCase();
		System.out.println(outro);
		
	}

}
