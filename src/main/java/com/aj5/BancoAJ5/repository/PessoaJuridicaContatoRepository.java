package com.aj5.BancoAJ5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aj5.BancoAJ5.domains.PessoaJuridicaContato;
@Repository
public interface PessoaJuridicaContatoRepository extends JpaRepository<PessoaJuridicaContato, Long>{

}
