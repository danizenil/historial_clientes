package com.alfa.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CONCEPTOS")
public class Concepto {
	@Id
	@SequenceGenerator(name = "conceptos_generator", sequenceName = "conceptos_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conceptos_generator")
	@Column(name = "ID")
	private Integer id;

	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "CATEGORIA")
	private String categoria;
	
	@OneToMany(mappedBy = "concepto")
	private List<RegistroConcepto> registroConceptos;

	public Concepto(Integer id, String descripcion, String categoria) {
		this.id = id;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}

	public Concepto() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
