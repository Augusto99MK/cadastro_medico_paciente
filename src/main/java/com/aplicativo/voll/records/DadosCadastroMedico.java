package com.aplicativo.voll.records;

import com.aplicativo.voll.enums.Especialidade;

public record DadosCadastroMedico (String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
	
}