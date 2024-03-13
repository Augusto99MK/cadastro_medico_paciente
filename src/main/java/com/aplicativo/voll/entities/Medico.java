package com.aplicativo.voll.entities;

import com.aplicativo.voll.enums.Especialidade;
import com.aplicativo.voll.records.DadosCadastroMedico;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "medicos")
@Entity(name = "Medico")
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
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
	
public Medico(DadosCadastroMedico dados) {
	
	this.nome = dados.nome();
	this.email = dados.email();
	this.crm = dados.crm();
	this.endereco = new Endereco(dados.endereco());
		
	}
	
	public Medico(long id, String nome, String email, String crm, Especialidade especialidade, Endereco endereco) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.crm = crm;
		this.especialidade = especialidade;
		this.endereco = endereco;
	}
	
	//getters e setters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
