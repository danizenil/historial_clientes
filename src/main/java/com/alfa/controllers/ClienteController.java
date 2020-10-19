package com.alfa.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.alfa.exception.HistorialClientesException;
import com.alfa.models.Cliente;
import com.alfa.services.ClienteService;

@RestController
@RequestMapping(value = "/api")
public class ClienteController {

  @Autowired
  ClienteService clienteService;

  @GetMapping(value = "cliente", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Cliente> getAllClientes() {
    return clienteService.getAllClientes();
  }

  @GetMapping(value = "cliente/{idCliente}", produces = MediaType.APPLICATION_JSON_VALUE)
  public Cliente getByIdCliente(@PathVariable("idCliente") Integer idCliente)
      throws HistorialClientesException {
    return clienteService.getByIdCliente(idCliente);
  }

  @DeleteMapping(value = "cliente/{idCliente}")
  public void deleteCliente(@PathVariable("idCliente") Integer idCliente) {
    clienteService.deleteCliente(idCliente);
  }

  @PostMapping(value = "cliente", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public Cliente saveCliente(@RequestBody Cliente cliente) {
    return clienteService.saveCliente(cliente);
  }

  @PutMapping(value = "cliente", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public Cliente updateCliente(@RequestBody Cliente cliente) {
    return clienteService.updateCliente(cliente);
  }

}
