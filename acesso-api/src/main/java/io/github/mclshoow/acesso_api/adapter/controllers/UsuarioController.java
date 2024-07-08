package io.github.mclshoow.acesso_api.adapter.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.github.mclshoow.acesso_api.adapter.converters.UsuarioConverter;
import io.github.mclshoow.acesso_api.adapter.dtos.UsuarioDto;
import io.github.mclshoow.acesso_api.core.domain.Usuario;
import io.github.mclshoow.acesso_api.core.ports.UsuarioServicePort;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioController 
{
	private final UsuarioServicePort usuarioServicePort;
	private final UsuarioConverter usuarioConverter;
	
	public UsuarioController(UsuarioServicePort usuarioServicePort, UsuarioConverter usuarioConverter)
	{
		this.usuarioServicePort = usuarioServicePort;
		this.usuarioConverter = usuarioConverter;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioDto create(@RequestBody UsuarioDto usuarioDto)
	{
		Usuario novoUsuario = usuarioServicePort
				.createUsuario(usuarioConverter
						.toTomain(usuarioDto));
		
		return usuarioConverter.toDto(novoUsuario);
	}
}
