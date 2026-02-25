package br.com.fiapride.main;

//Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Mochila;

public class SistemaPrincipal {

 public static void main(String[] args) {
	// Dentro do main...// Fabriquei a primeira (Instância 1)
	 Mochila minhaMochila = new Mochila();
	 minhaMochila.cor = "Azul";
	 minhaMochila.pesoMaximoKg = 30;
	 // Fabriquei a segunda (Instância 2)
	 Mochila mochilaDoProfessor = new Mochila();
	 mochilaDoProfessor.cor = "laranja";
	 mochilaDoProfessor.pesoMaximoKg = 40;
	 System.out.println("Minha mochila é: " + minhaMochila.cor);
	 System.out.println("A do professor é: " + mochilaDoProfessor.cor);
	 System.out.printf("Minha mochila aguenta: %.1f kg%n", minhaMochila.pesoMaximoKg);
	 System.out.printf("A do professor aguenta: %.1f kg%n", mochilaDoProfessor.pesoMaximoKg);
 }
}