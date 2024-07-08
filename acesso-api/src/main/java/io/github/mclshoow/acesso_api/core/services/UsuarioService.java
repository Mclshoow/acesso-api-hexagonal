package io.github.mclshoow.acesso_api.core.services;

import io.github.mclshoow.acesso_api.core.domain.Usuario;
import io.github.mclshoow.acesso_api.core.ports.UsuarioRepositoryPort;
import io.github.mclshoow.acesso_api.core.ports.UsuarioServicePort;

public class UsuarioService implements UsuarioServicePort 
{
	private final UsuarioRepositoryPort usuarioRepositoryPort;
	
	public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort)
	{
		this.usuarioRepositoryPort = usuarioRepositoryPort;
	}
	
	@Override
	public Usuario createUsuario(Usuario usuario)
	{
		Usuario usuarioExistente = usuarioRepositoryPort.obtainByEmail(usuario.getEmail());
		if(usuarioExistente != null)
		{
			throw new IllegalArgumentException("Usuário já existe!");
		}
		return usuarioRepositoryPort.create(usuario);
	}
}
