package com.alfa.services;

import java.util.List;
import com.alfa.exception.HistorialClientesException;
import com.alfa.models.Cliente;

public interface ClienteService {

  List<Cliente> getAllClientes();

  Cliente getByIdCliente(Integer idCliente) throws HistorialClientesException;

  boolean deleteCliente(Integer idCliente);

  Cliente saveCliente(Cliente cliente);

  Cliente updateCliente(Cliente cliente);

}
