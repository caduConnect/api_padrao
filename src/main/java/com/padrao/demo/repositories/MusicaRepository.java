package com.padrao.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.padrao.demo.models.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long> {

}