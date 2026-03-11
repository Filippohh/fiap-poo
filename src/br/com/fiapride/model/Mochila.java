package br.com.fiapride.model;

public class Mochila {

    // ATRIBUTOS PROTEGIDOS (ENCAPSULAMENTO)
    private String cor;
    private String donoDaMochila;
    private double pesoNaMochila;

    // CONSTRUTOR
    public Mochila(String cor, String donoDaMochila) {
        this.cor = cor;
        this.donoDaMochila = donoDaMochila;
        this.pesoNaMochila = 0.0;
    }

    // GETTERS E SETTERS

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDonoDaMochila() {
        return donoDaMochila;
    }

    public void setDonoDaMochila(String donoDaMochila) {
        this.donoDaMochila = donoDaMochila;
    }

    public double getPesoNaMochila() {
        return pesoNaMochila;
    }

    // MÉTODOS (COMPORTAMENTOS)

    public void adicionarPeso(double peso) {

        if (peso <= 0) {
            System.out.println("Erro: O peso adicional deve ser maior que zero.");
            return;
        }

        this.pesoNaMochila += peso;
        System.out.println("Peso adicionado. Novo peso: " + this.pesoNaMochila + " kg");
    }

    public void removerPeso(double pesoRemovido) {

        if (pesoRemovido <= 0) {
            System.out.println("Erro: esse peso não pode ser removido.");
            return;
        }

        if (this.pesoNaMochila < pesoRemovido) {
            System.out.println("Erro: não pode ser removido mais peso do que a mochila possui.");
            return;
        }

        this.pesoNaMochila -= pesoRemovido;
        System.out.println("Peso removido. Peso restante: " + this.pesoNaMochila + " kg");
    }
}