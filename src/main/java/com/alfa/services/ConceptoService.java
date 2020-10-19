package com.alfa.services;

import java.util.List;

import com.alfa.models.Cliente;
import com.alfa.models.Concepto;

public interface ConceptoService {
	
	List<Concepto> getAllConcepto();
	Concepto getByIdConcepto(Integer idConcepto);
	boolean deleteConcepto(Integer idConcepto);
	Concepto saveConcepto(Concepto concepto );
	Concepto updateConcepto(Concepto concepto);
}
