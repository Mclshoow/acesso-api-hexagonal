package io.github.mclshoow.acesso_api.adapter.converters;

import org.springframework.stereotype.Component;

import io.github.mclshoow.acesso_api.adapter.dtos.UsuarioDto;
import io.github.mclshoow.acesso_api.core.domain.Pessoa;
import io.github.mclshoow.acesso_api.core.domain.Usuario;

@Component
public class UsuarioConverter 
{
	public Usuario toTomain(UsuarioDto usuarioDto)
	{
		return new Usuario
		(
				usuarioDto.getId(), 
				usuarioDto.getEmail(), 
				usuarioDto.getSenha(),
				usuarioDto.getAdministrador(),
				new Pessoa(null, usuarioDto.getNome())
		);
	}
	
	public UsuarioDto toDto (Usuario usuario) 
	{
		return new UsuarioDto
		(
				usuario.getId(), 
				usuario.getPessoa().getNome(), 
				usuario.getEmail(), 
				usuario.getSenha(), 
				usuario.getAdministrador()
		);
	}
}
