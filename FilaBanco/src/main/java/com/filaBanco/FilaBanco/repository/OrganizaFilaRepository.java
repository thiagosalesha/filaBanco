package com.filaBanco.FilaBanco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filaBanco.FilaBanco.model.OrganizaFila;
import com.filaBanco.FilaBanco.model.Pessoa;

@Repository
public interface OrganizaFilaRepository extends JpaRepository<OrganizaFila, Integer>{

}
