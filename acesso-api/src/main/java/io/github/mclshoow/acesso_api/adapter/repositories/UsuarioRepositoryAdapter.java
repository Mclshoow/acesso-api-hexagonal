package io.github.mclshoow.acesso_api.adapter.repositories;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import io.github.mclshoow.acesso_api.adapter.entities.PessoaEntity;
import io.github.mclshoow.acesso_api.adapter.entities.UsuarioEntity;
import io.github.mclshoow.acesso_api.core.domain.Pessoa;
import io.github.mclshoow.acesso_api.core.domain.Usuario;
import io.github.mclshoow.acesso_api.core.ports.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort
{
	private final UsuarioRepository usuarioRepository;
	private final PessoaRepository pessoaRepository;
	private final ModelMapper modelMapper;
	
	public UsuarioRepositoryAdapter
	(
			UsuarioRepository usuarioRepository, 
			ModelMapper modelMapper, 
			PessoaRepository pessoaRepository
	)
	{
		this.usuarioRepository = usuarioRepository;
		this.modelMapper = modelMapper;
		this.pessoaRepository = pessoaRepository;
	}
	
	@Override
	public Usuario create(Usuario usuario) 
	{
		UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class);
		usuarioEntity.setPessoaEntity(createPessoa(usuario.getPessoa()));
		UsuarioEntity novoUsuario = usuarioRepository.save(usuarioEntity);
		
		return modelMapper.map(novoUsuario, Usuario.class);
	}
	
	private PessoaEntity createPessoa(Pessoa pessoa)
	{
		PessoaEntity pessoaEntity = modelMapper.map(pessoa, PessoaEntity.class);
		return pessoaRepository.save(pessoaEntity);
	}

	@Override
	public Usuario obtainByEmail(String email) {
		UsuarioEntity usuarioByEmail = usuarioRepository
				.findByEmail(email);
		
		if(usuarioByEmail == null) 
		{
			return null;
		}
		
		return modelMapper.map(usuarioByEmail, Usuario.class);
	}
}
