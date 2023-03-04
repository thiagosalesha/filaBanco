package com.filaBanco.FilaBanco.dto;

import java.util.Random;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.filaBanco.FilaBanco.model.Pessoa;
import com.filaBanco.FilaBanco.repository.OrganizaFilaRepository;
import com.filaBanco.FilaBanco.repository.PessoaRepository;

public class PessoaDTO {
	private int id;
	@NotNull @NotEmpty 
	private String nome;
	
	@NotNull @NotEmpty
	private int idade;
	
	private int posicao;
	
	@NotNull @NotEmpty 
	private String telefone;

	
	public PessoaDTO(String nome, int idade, int posicao, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
		this.telefone = telefone;
	}



	public PessoaDTO() {
	}



	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public int getPosicao() {
		return posicao;
	}



	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Pessoa atualizar(int id, PessoaRepository pessoaRepository) {
		Pessoa pessoa = pessoaRepository.getReferenceById(id);
		if (pessoa != null) {
			pessoa.setNome(nome);
			pessoa.setIdade(idade);
			pessoa.setTelefone(telefone);
		}
		return pessoa;
	}
	
	public Pessoa converteParaPessoa() {
		return new Pessoa(nome, idade, posicao, telefone);
	}
	
	public int geradorAleatorio(OrganizaFilaRepository filaRepository) {
		Integer[] numeros = new Integer[50];
		Random radom = new Random();
		int numeroTmp = radom.nextInt(1000,9999);
		return null;
	}
	
	//Metodo responsável pelo envio do sms
	public void enviaSMS() {
		
	}

}

