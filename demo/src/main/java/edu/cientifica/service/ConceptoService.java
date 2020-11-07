package edu.cientifica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.cientifica.model.Concepto;

@Service
public interface ConceptoService {
	public List<Concepto> listarConcepto();
}
