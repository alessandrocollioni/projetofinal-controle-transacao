package com.aj5.BancoAJ5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj5.BancoAJ5.domains.PessoaFisicaContato;
@Repository
public interface PessoaFisicaContatoRepository extends JpaRepository<PessoaFisicaContato, Long>{

}
