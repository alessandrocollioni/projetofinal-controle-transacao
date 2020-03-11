package com.aj5.BancoAJ5.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aj5.BancoAJ5.domains.Taxa;
import com.aj5.BancoAJ5.service.TaxaService;


@RestController
@RequestMapping("/taxa")
public class TaxaController {
	
	private TaxaService service;

	public TaxaController(TaxaService service) {
		this.service = service;
	}
	
	@ApiOperation(value="Consulta todos Taxas do sistema", notes="Consulta Ass�ncrona.")
	@GetMapping
	public ResponseEntity<List<Taxa>> getAll(){
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@ApiOperation(value="Consulta Taxa espec�fico do sistema", notes="Consulta Ass�ncrona.")
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Taxa>> getByID(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.service.getById(id));
	}
	
	@ApiOperation(value="Cadastra Taxa no sistema", notes="Consulta Ass�ncrona.")
	@PostMapping
	public String save(@RequestBody Taxa Taxa) {
		return this.service.create(Taxa).toString();
	}
	
	@ApiOperation(value="Deleta Taxa espec�fico do sistema", notes="Consulta Ass�ncrona.")
	@DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
    	this.service.remove(id);
    	return "Taxa " + id + " deletado.";
    }
}
