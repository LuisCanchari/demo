package edu.cientifica.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cientifica.mappers.ConceptoMapper;
import edu.cientifica.model.Concepto;
import edu.cientifica.service.ConceptoService;

@Service
public class ConceptoServiceImpl implements ConceptoService{
	
	@Autowired
	ConceptoMapper conceptoMapper;

	@Override
	public List<Concepto> listarConcepto() {
		return conceptoMapper.selectConcepto();
	}

}
