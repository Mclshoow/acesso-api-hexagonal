package io.github.mclshoow.acesso_api.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_pessoa")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PessoaEntity 
{
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
}
