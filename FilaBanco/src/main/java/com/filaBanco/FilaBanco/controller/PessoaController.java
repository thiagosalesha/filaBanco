package com.filaBanco.FilaBanco.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filaBanco.FilaBanco.dto.PessoaDTO;
import com.filaBanco.FilaBanco.model.Pessoa;
import com.filaBanco.FilaBanco.repository.PessoaRepository;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> pessoasCadastradas() {
		List<Pessoa> listaPessoasCadastradas = pessoaRepository.findAll();
		return ResponseEntity.ok(listaPessoasCadastradas);
	}
	
	@PostMapping
	public String cadastrarPessoa(@RequestBody @Valid PessoaDTO pessoaDTO) {
		return null;
	}
	
	@PutMapping("{id}")
	public ResponseEntity<String> atualizarPessoa(@PathVariable Integer id, 
			@RequestBody @Valid PessoaDTO pessoaDTO){
		Pessoa atualizar = pessoaDTO.atualizar(id, pessoaRepository);
		return ResponseEntity.ok("Atualizado com sucesso, usuário ID: "+id);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletarPessoa(@PathVariable Integer id){
		pessoaRepository.deleteById(id);
		return ResponseEntity.ok("Deletado com sucesso, usuário ID: "+id);
	}
	
	
}
