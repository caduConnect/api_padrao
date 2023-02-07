package com.padrao.demo.models;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "musica")
public class Musica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String Nome;
	private String Autor;
	private String Duracao;
	
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Musica other = (Musica) obj;
		return Objects.equals(Id, other.Id);
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getDuracao() {
		return Duracao;
	}
	public void setDuracao(String duracao) {
		Duracao = duracao;
	}

	
	
}
