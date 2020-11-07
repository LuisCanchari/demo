package edu.cientifica.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cientifica.model.Concepto;
import edu.cientifica.service.ConceptoService;

@RestController
@RequestMapping("/rest/concepto")
public class ConceptoController {
	
	@Autowired
	ConceptoService conceptoService;
	
	@GetMapping("/all")
	public List<Concepto>getAllConcepto(){
		List<Concepto> lista;
		lista = conceptoService.listarConcepto();
		return lista;
	}

}
