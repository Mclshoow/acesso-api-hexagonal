package io.github.mclshoow.acesso_api.adapter.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioDto
{
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private Boolean administrador;
	
	public UsuarioDto() {}
	
	public UsuarioDto(Long id, String nome, String email, String senha, Boolean administrador)
	{
		this.setId(id);
		this.setNome(nome);
		this.setEmail(email);
		this.setSenha(senha);
		this.setAdministrador(administrador);
	}
	
	public Long getId() { return id; }
	
	public void setId(Long id) { this.id = id; }
	
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public String getEmail() { return email; }
	
	public void setEmail(String email) { this.email = email; }
	
	public String getSenha() { return senha; }
	
	public void setSenha(String senha) { this.senha = senha; }
	
	public Boolean getAdministrador() { return administrador; }
	
	public void setAdministrador(Boolean administrador) { this.administrador = administrador; }
}