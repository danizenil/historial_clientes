package com.alfa.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "sesiones")
public class Sesion {
  @Id
  @SequenceGenerator(name = "sesion_generator", sequenceName = "sesiones_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sesion_generator")
  @Column(name = "ID")
  private Integer id;

  @Column(name = "FECHA")
  private Date fecha;

  @Column(name = "DESCRIPCION")
  private String descripcion;

  @Column(name = "TIPO")
  private String tipo;

  @Column(name = "KILOMETRAJE_TOTAL")
  private String kilometrajeTotal;

  @Column(name = "ESTADO")
  private String estado;

  public Sesion(Integer id, Date fecha, String descripcion, String tipo, String kilometrajeTotal,
      String estado) {
    this.id = id;
    this.fecha = fecha;
    this.descripcion = descripcion;
    this.tipo = tipo;
    this.kilometrajeTotal = kilometrajeTotal;
    this.estado = estado;
  }

  public Sesion() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getKilometrajeTotal() {
    return kilometrajeTotal;
  }

  public void setKilometrajeTotal(String kilometrajeTotal) {
    this.kilometrajeTotal = kilometrajeTotal;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }



}
