package br.com.fiapride.model;

public class Mochila {

    // ATRIBUTOS (encapsulados)
    private String cor;
    private String donoDaMochila;
    private double pesoNaMochila;

    // CONSTRUTOR (OBRIGATÓRIO - nascimento do objeto)
    public Mochila(String cor, String donoDaMochila) {
        this.setCor(cor);
        this.setDonoDaMochila(donoDaMochila);
        this.pesoNaMochila = 0.0;
    }

    // GETTERS E SETTERS

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) {
            System.out.println("Erro: cor não pode ser vazia.");
            return;
        }
        this.cor = cor;
    }

    public String getDonoDaMochila() {
        return donoDaMochila;
    }

    public void setDonoDaMochila(String donoDaMochila) {
        if (donoDaMochila == null || donoDaMochila.isEmpty()) {
            System.out.println("Erro: dono não pode ser vazio.");
            return;
        }
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