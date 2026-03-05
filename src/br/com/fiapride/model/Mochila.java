package br.com.fiapride.model;
public class Mochila { // <-- Use o nome do SEU objeto    
    // As características que você pensou    
    public String cor;
    public String donoDaMochila;
    public double pesoNaMochila;
    
    public Mochila(String cor, String donoDaMochila) {
    	this.cor = cor;
    	this.donoDaMochila = donoDaMochila;
    	this.pesoNaMochila = 0.0;
    }
    
    public void adicionarPeso(double peso) {
    	
    	if (peso <= 0) {
    		System.out.println("Erro: O peso adicional deve ser maior que zero.");
    		
    				return;
    	}
    	this.pesoNaMochila += peso;
    	System.out.println("Peso adicionado. Novo saldo: " + this.pesoNaMochila);
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
    	System.out.println("Peso removido. Peso restante: " + this.pesoNaMochila);
    }
}

    
    