package com.aplicativo.voll.entities;

import com.aplicativo.voll.enums.Especialidade;
import com.aplicativo.voll.records.DadosEndereco;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Table(name = "medicos")
@Entity(name = "Medico")

public class Medico {
	
	int id;
	private String nome;
	private String email;
	private String crm;
	
	@Enumerated(EnumType.STRING)
	private Especialidade especialidade;
	@Embedded
	private Endereco endereco;
	
	//construtores
	
	public Medico() {
		
	}
	
	public Medico(int id, String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.crm = crm;
		this.especialidade = especialidade;
		this.endereco = endereco;
	}
	
	//getters e setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	public DadosEndereco getEndereco() {
		return endereco;
	}
	public void setEndereco(DadosEndereco endereco) {
		this.endereco = endereco;
	}

}
