package com.algaworks.brewer.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Cerveja {

	@javax.validation.constraints.NotBlank(message = "SKU é obrigatório")
	private String sku;
	
	@NotBlank(message = "Nome é obrigatório")
	@Size(min = 3, max = 100, message ="O nome deve ter entre 3 e 100 caracteres")
	private String nome;
	
	@Size(min = 3, max = 200, message = "A descrição deve conter entre 3 e 300 caracteres")
	private String descricao;
	

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
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
