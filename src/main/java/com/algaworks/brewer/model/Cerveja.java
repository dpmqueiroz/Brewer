package com.algaworks.brewer.model;

public class Cerveja {

	@javax.validation.constraints.NotBlank
	private String sku;
	
	private String nome;
	
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
