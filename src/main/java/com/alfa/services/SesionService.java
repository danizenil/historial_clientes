package com.alfa.services;

import java.util.List;
import com.alfa.exception.HistorialClientesException;
import com.alfa.models.Sesion;

public interface SesionService {

  List<Sesion> getAllSesion();

  Sesion getByIdCliente(Integer idSesion) throws HistorialClientesException;

  boolean deleteSesion(Integer idSesion);

  Sesion saveSesion(Sesion sesion);

  Sesion updateSesion(Sesion sesion);

}
