package com.alfa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="REGISTRO_CONCEPTOS")
public class RegistroConcepto {
	@Id
	@SequenceGenerator(name = "registro_conceptos_generator", sequenceName = "registro_concepto_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="registro_conceptos_generator" )
	@Column(name="ID")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID", referencedColumnName = "ID")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name="CONCEPTO_ID", referencedColumnName = "ID")
	private Concepto concepto;
	private Double monto;
	
	public RegistroConcepto() {
	}
	
	
	public RegistroConcepto(Integer id, Cliente cliente, Concepto concepto, Double monto) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.concepto = concepto;
		this.monto = monto;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Concepto getConcepto() {
		return concepto;
	}


	public void setConcepto(Concepto concepto) {
		this.concepto = concepto;
	}


	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	

}
