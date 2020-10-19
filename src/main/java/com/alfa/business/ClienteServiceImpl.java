package com.alfa.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alfa.exception.ExceptionNotFound;
import com.alfa.exception.HistorialClientesException;
import com.alfa.models.Cliente;
import com.alfa.repositories.ClienteRepository;
import com.alfa.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
  @Autowired
  private ClienteRepository repository;

  @Override
  public List<Cliente> getAllClientes() {
    return repository.findAll();
  }

  @Override
  public Cliente getByIdCliente(Integer idCliente) throws HistorialClientesException {
    return repository.findById(idCliente)
        .orElseThrow(() -> new ExceptionNotFound("CLIENTE DON'T FOUND", "CLIENTE DON'T FOUND"));
  }

  @Override
  public boolean deleteCliente(Integer idCliente) {
    repository.deleteById(idCliente);
    return true;
  }

  @Override
  public Cliente saveCliente(Cliente cliente) {
    return repository.saveAndFlush(cliente);
  }

  @Override
  public Cliente updateCliente(Cliente cliente) {
    return repository.saveAndFlush(cliente);
  }

}
