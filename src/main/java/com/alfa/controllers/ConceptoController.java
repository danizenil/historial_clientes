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
import org.springframework.web.bind.annotation.RestController;

import com.alfa.models.Concepto;
import com.alfa.services.ConceptoService;

@RestController
public class ConceptoController {
	
	@Autowired
	private ConceptoService conceptoService;
	
	@GetMapping(value = "conceptos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Concepto> getAllConceptos(){
		return conceptoService.getAllConcepto();
	}
	
	@GetMapping(value = "concepto/{idConcepto}", produces = MediaType.APPLICATION_JSON_VALUE )
	public Concepto getByIdConcepto(@PathVariable("idConcepto") Integer idConcepto) {
		return conceptoService.getByIdConcepto(idConcepto);
	}
	
	@DeleteMapping(value="concepto/{idConcepto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteConcepto(@PathVariable("idConcepto") Integer idConcepto) {
		conceptoService.deleteConcepto(idConcepto);
	}
	@PostMapping(value = "concepto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Concepto saveConcepto(@RequestBody Concepto concepto) {
			return conceptoService.saveConcepto(concepto);
	}
	
	@PutMapping(value = "concepto", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Concepto updateConcepto(@RequestBody Concepto concepto) {
			return conceptoService.updateConcepto(concepto);
	}
}
