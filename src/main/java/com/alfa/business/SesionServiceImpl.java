package com.alfa.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alfa.exception.ExceptionNotFound;
import com.alfa.exception.HistorialClientesException;
import com.alfa.models.Sesion;
import com.alfa.repositories.SesionRepository;
import com.alfa.services.SesionService;

@Service
public class SesionServiceImpl implements SesionService {
  @Autowired
  private SesionRepository repository;

  @Override
  public List<Sesion> getAllSesion() {
    return repository.findAll();
  }

  @Override
  public Sesion getByIdCliente(Integer idSesion) throws HistorialClientesException {
    return repository.findById(idSesion)
        .orElseThrow(() -> new ExceptionNotFound("SESION DON'T FOUND", "SESION DON'T FOUND"));
  }

  @Override
  public boolean deleteSesion(Integer idSesion) {
    repository.deleteById(idSesion);
    return true;
  }

  @Override
  public Sesion saveSesion(Sesion sesion) {
    return repository.saveAndFlush(sesion);
  }

  @Override
  public Sesion updateSesion(Sesion sesion) {
    return repository.saveAndFlush(sesion);
  }

}
