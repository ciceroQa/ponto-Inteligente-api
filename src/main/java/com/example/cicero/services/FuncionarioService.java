package com.example.cicero.services;

import java.util.Optional;

import com.example.cicero.entities.Funcionario;

public interface FuncionarioService {

	Funcionario persistir(Funcionario funcionario);

	Optional<Funcionario> buscarProCpf(String cpf);

	Optional<Funcionario> buscarProEmail(String email);

	Optional<Funcionario> buscarPorId(Long id);

}
