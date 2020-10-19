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
@Table(name="clientes")
public class Cliente {
	@Id
	@SequenceGenerator(name="clientes_generator", sequenceName = "clientes_seq", allocationSize = 1)
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator ="clientes_generator" )
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="PRIMER_APELLIDO")
	private String primerApellido;
	
	@Column(name="SEGUNDO_APELLIDO")
	private String segundoApellido;
	
	@OneToMany(mappedBy = "cliente")
	private List<RegistroConcepto> registroConceptos;
	
	
	public Cliente() {
		
	}
	
	public Cliente(Integer id, String nombre, String primerApellido, String segundoApellido) {
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
	

}
