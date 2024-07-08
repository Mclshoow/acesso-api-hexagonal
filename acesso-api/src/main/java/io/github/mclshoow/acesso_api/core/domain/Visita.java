package io.github.mclshoow.acesso_api.core.domain;

import java.time.LocalDateTime;

public class Visita 
{
	private Long id;
	private LocalDateTime dataHora;
	private Long idMorador;
	private Long idVisitante;
	
	public Visita() {}
	
	public Visita(Long id, LocalDateTime dataHora, Long idMorador, Long idVisitante)
	{
		this.setId(id);
		this.setDataHora(dataHora);
		this.setIdMorador(idMorador);
		this.setIdVisitante(idVisitante);
	}
	
	public Long getId() { return id; }
	
	public void setId(Long id) { this.id = id; }
	
	public LocalDateTime getDataHora() { return dataHora; }
	
	public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
	
	public Long getIdMorador() { return idMorador; }

	public void setIdMorador(Long idMorador) { this.idMorador = idMorador; }

	public Long getIdVisitante() { return idVisitante; }

	public void setIdVisitante(Long idVisitante) { this.idVisitante = idVisitante; }
}