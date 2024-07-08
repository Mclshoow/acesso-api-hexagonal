package io.github.mclshoow.acesso_api.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_usuario")
public class UsuarioEntity 
{
	@Id
	@GeneratedValue
	private Long id;
	private String email;
	private String senha;
	private Boolean administrador;
	@OneToOne
	@JoinColumn(name = "pessoa_id")
	private PessoaEntity pessoaEntity;
	
	public UsuarioEntity() {}
	
	public UsuarioEntity(Long id, String email, String senha, Boolean administrador, PessoaEntity pessoaEntity)
	{
		this.setId(id);
		this.setEmail(email);
		this.setSenha(senha);
		this.setAdministrador(administrador);
		this.setPessoaEntity(pessoaEntity);
	}
	
	public Long getId() { return id; }
	
	public void setId(Long id) { this.id = id; }
	
	public String getEmail() { return email; }
	
	public void setEmail(String email) { this.email = email; }
	
	public String getSenha() { return senha; }
	
	public void setSenha(String senha) { this.senha = senha; }
	
	public Boolean getAdministrador() { return administrador; }
	
	public void setAdministrador(Boolean administrador) { this.administrador = administrador; }

	public PessoaEntity getPessoaEntity() { return pessoaEntity; }

	public void setPessoaEntity(PessoaEntity pessoaEntity) { this.pessoaEntity = pessoaEntity; }
}
