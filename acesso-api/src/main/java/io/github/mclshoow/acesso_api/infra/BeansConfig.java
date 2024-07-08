package io.github.mclshoow.acesso_api.infra;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.mclshoow.acesso_api.core.ports.UsuarioRepositoryPort;
import io.github.mclshoow.acesso_api.core.ports.UsuarioServicePort;
import io.github.mclshoow.acesso_api.core.services.UsuarioService;

@Configuration
public class BeansConfig 
{
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	
	@Bean
	public UsuarioServicePort usuarioServiceImpl(UsuarioRepositoryPort usuarioRepositoryPort) 
	{
		return new UsuarioService(usuarioRepositoryPort);
	}
}
