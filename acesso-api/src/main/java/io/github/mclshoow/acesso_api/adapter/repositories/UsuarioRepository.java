package io.github.mclshoow.acesso_api.adapter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.mclshoow.acesso_api.adapter.entities.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository <UsuarioEntity, Long>
{
	UsuarioEntity findByEmail(String email);
}
