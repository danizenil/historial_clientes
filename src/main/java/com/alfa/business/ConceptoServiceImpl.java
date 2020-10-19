package com.alfa.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfa.models.Cliente;
import com.alfa.models.Concepto;
import com.alfa.repositories.ClienteRepository;
import com.alfa.repositories.ConceptoRepository;
import com.alfa.services.ClienteService;
import com.alfa.services.ConceptoService;

@Service
public class ConceptoServiceImpl implements ConceptoService {
	@Autowired
	private ConceptoRepository repository;

	@Override
	public List<Concepto> getAllConcepto() {
		return repository.findAll();
	}

	@Override
	public Concepto getByIdConcepto(Integer idConcepto) {
		return repository.getOne(idConcepto);
	}

	@Override
	public boolean deleteConcepto(Integer idConcepto) {
		repository.deleteById(idConcepto);
		return false;
	}

	@Override
	public Concepto saveConcepto(Concepto concepto) {
		return repository.saveAndFlush(concepto);
	}

	@Override
	public Concepto updateConcepto(Concepto concepto) {
		return repository.saveAndFlush(concepto);
	}
	
}
