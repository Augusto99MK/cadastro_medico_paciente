package com.aplicativo.voll.aplicativo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicativo.voll.aplicativo.repositories.MedicoRepository;
import com.aplicativo.voll.entities.Medico;
import com.aplicativo.voll.records.DadosCadastroMedico;

@RestController
@RequestMapping("/medicos")
public class MedicoController{
	
	@Autowired
	private MedicoRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroMedico dados){
		repository.save(new Medico(dados));
		
	}

}
