package io.github.mclshoow.acesso_api.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.mclshoow.acesso_api.adapter.entities.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long>
{
	
}
