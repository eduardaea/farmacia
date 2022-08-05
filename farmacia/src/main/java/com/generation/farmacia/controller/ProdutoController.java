package com.generation.farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.farmacia.model.ProdutoModel;
import com.generation.farmacia.repository.ProdutoRepository;


@RestController
@RequestMapping("/produtos")
@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity<List<ProdutoModel>>get(){
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	@PostMapping
	public ResponseEntity<ProdutoModel>post(@RequestBody ProdutoModel produto){
		return ResponseEntity.ok(produtoRepository.save(produto));
	}
	@PutMapping
	public ResponseEntity<ProdutoModel>get(@RequestBody ProdutoModel produto){
		return ResponseEntity.ok(produtoRepository.save(produto));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
		produtoRepository.deleteById(id);
	}
	
}
