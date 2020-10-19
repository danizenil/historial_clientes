package com.alfa.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.alfa.models.Sesion;
import com.alfa.services.SesionService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/api")
public class SesionController {
  @Autowired
  SesionService sesionService;

  @GetMapping(value = "sesion", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Sesion> getAllSesions() {
    return sesionService.getAllSesion();
  }

  @GetMapping(value = "sesion/{idSesion}", produces = MediaType.APPLICATION_JSON_VALUE)
  public Sesion getByIdSesion(@PathVariable("idSesion") Integer idSesion)
      throws HistorialClientesException {
    return sesionService.getByIdCliente(idSesion);
  }

  @DeleteMapping(value = "sesion/{idSesion}")
  public void deleteSesion(@PathVariable("idSesion") Integer idSesion) {
    sesionService.deleteSesion(idSesion);
  }

  @PostMapping(value = "sesion", produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public Sesion saveSesion(@RequestBody Sesion sesion) {
    return sesionService.saveSesion(sesion);

  }

  @PutMapping(value = "sesion", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public Sesion updateCliente(@RequestBody Sesion sesion) {
    return sesionService.updateSesion(sesion);
  }

}
