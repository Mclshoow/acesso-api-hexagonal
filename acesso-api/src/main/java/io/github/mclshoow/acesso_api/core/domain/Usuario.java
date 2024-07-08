package io.github.mclshoow.acesso_api.core.domain;

public class Usuario 
{
	private Long id;
	private String email;
	private String senha;
	private Boolean administrador;
	private Pessoa pessoa;
	
	public Usuario() {}
	
	public Usuario(Long id, String email, String senha, Boolean administrador, Pessoa pessoa)
	{
		this.setId(id);
		this.setEmail(email);
		this.setSenha(senha);
		this.setAdministrador(administrador);
		this.setPessoa(pessoa);
	}
	
	public Long getId() { return id; }
	
	public void setId(Long id) { this.id = id; }
	
	public String getEmail() { return email; }
	
	public void setEmail(String email) { this.email = email; }
	
	public String getSenha() { return senha; }
	
	public void setSenha(String senha) { this.senha = senha; }
	
	public Boolean getAdministrador() { return administrador; }
	
	public void setAdministrador(Boolean administrador) { this.administrador = administrador; }

	public Pessoa getPessoa() { return pessoa; }

	public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
}