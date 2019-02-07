package br.com.cerveja.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="cerveja", schema="modelo")
public class Cerveja {

	@Id
	@SequenceGenerator(name = "tcerveja", sequenceName = "modelo.cerveja_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "tcerveja", strategy = GenerationType.AUTO)
	@Column(unique = true)
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	@Column(name="id_tipo")
	private TipoCerveja tipo;
	
	public Cerveja() {	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCerveja getTipo() {
		return tipo;
	}

	public void setTipo(TipoCerveja tipo) {
		this.tipo = tipo;
	}
	
}
