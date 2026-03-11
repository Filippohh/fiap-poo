package br.com.fiapride.main;

// Importamos a classe Mochila
import br.com.fiapride.model.Mochila;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("=== Sistema de Mochilas ===");

        // Criando mochila 1
        Mochila mochila1 = new Mochila("Verde", "Enzo");

        System.out.println("\nAdição de peso na mochila 1");
        mochila1.adicionarPeso(3.5);

        System.out.println("\nRemoção de peso na mochila 1");
        mochila1.removerPeso(1.0);

        System.out.println("\nTentando remover peso inválido");
        mochila1.removerPeso(10);

        System.out.println("\nEstado da Mochila 1");
        System.out.println("Dono: " + mochila1.getDonoDaMochila());
        System.out.println("Cor: " + mochila1.getCor());
        System.out.println("Peso atual: " + mochila1.getPesoNaMochila() + " kg");


        // Criando mochila 2
        Mochila mochila2 = new Mochila("Preta", "Maria");

        System.out.println("\nAdição de peso na mochila 2");
        mochila2.adicionarPeso(5);

        System.out.println("\nTentando adicionar peso inválido");
        mochila2.adicionarPeso(-2);

        System.out.println("\nEstado da Mochila 2");
        System.out.println("Dono: " + mochila2.getDonoDaMochila());
        System.out.println("Cor: " + mochila2.getCor());
        System.out.println("Peso atual: " + mochila2.getPesoNaMochila() + " kg");

    }
}