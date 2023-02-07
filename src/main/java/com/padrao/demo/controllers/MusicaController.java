package com.padrao.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.padrao.demo.models.Musica;
import com.padrao.demo.services.MusicaService;



@RestController
@RequestMapping("/api/v1/musica")
public class MusicaController {
	
	@Autowired
	private MusicaService musicaService;

	
	@GetMapping
	public List<Musica> obterTodos() {
		return musicaService.obterTodos();
	}

	
	@GetMapping("/{id}")
	public Optional<Musica> obterporId(@PathVariable Long id) {
		return musicaService.obterPorId(id);
	}
	
	@PostMapping
	public Musica adicionar(@RequestBody Musica musica) {
		return musicaService.adicionar(musica);

	}

	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletar(@PathVariable Long id) {
		musicaService.deletar(id);
	}


	
	@PutMapping("/{id}")
	public Musica atualizar(@PathVariable Long id, @RequestBody Musica musica) {
		return musicaService.atualizar(id, musica);

	}

}
