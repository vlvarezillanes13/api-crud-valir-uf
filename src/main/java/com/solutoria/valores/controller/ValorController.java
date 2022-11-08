package com.solutoria.valores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solutoria.valores.models.Valor;
import com.solutoria.valores.services.ValorServicio;


@RestController
@RequestMapping("/api/valor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ValorController {

	@Autowired
	private ValorServicio valorServicio;
	
	@GetMapping("/getAllValores")
	public List<Valor> getAllValoress(){
		return (List<Valor>) this.valorServicio.getAllValores();
	}
	
	@GetMapping("/getValor/{id}")
	public Valor getValorById(@PathVariable Integer id){
		return this.valorServicio.getValorById(id);
	}
	
	@PostMapping("/addValor")
	public Valor addValor( @RequestBody Valor valor) {
		return  this.valorServicio.addValor(valor);
	}
	
	@PutMapping("/updateValor")
	public Valor updateValor( @RequestBody Valor valor) {
		return this.valorServicio.updateValor(valor);
	}
	
	@DeleteMapping("/deleteValor/{id}")
	public Valor deleteValorById( @PathVariable Integer id) {
		return this.valorServicio.deleteValorById(id);
	}
	
	@PostMapping("/addValores")
	public Boolean addValores( @RequestBody List<Valor> valores) {
		return this.valorServicio.addValores(valores);
	}
}
