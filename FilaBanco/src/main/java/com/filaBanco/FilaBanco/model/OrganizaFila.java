package com.filaBanco.FilaBanco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrganizaFila {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int posicao;
	private String nome;
	private int idPessoa;
	
	
	
	public OrganizaFila(int id, int posicao, String nome, int idPessoa) {
		this.id = id;
		this.posicao = posicao;
		this.nome = nome;
		this.idPessoa = idPessoa;
	}
	
	
	public OrganizaFila() {
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	

}
