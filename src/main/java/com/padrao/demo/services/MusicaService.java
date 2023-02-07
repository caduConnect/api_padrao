package com.padrao.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padrao.demo.models.Musica;
import com.padrao.demo.repositories.MusicaRepository;

@Service
public class MusicaService {
	@Autowired
	private MusicaRepository musicaRepository;

	public List<Musica> obterTodos() {

		return musicaRepository.findAll();
	}

	public Optional<Musica> obterPorId(Long id) {

		return musicaRepository.findById(id);

	}

	public Musica adicionar(Musica tipo) {

		tipo.setId(null);
		return musicaRepository.save(tipo);

	}

	public void deletar(Long id) {
		musicaRepository.deleteById(id);
	}

	public Musica atualizar(Long id, Musica tipo) {

		tipo.setId(id);
		return musicaRepository.save(tipo);

	}

}
