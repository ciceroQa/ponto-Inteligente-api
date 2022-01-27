package com.example.cicero.services;

import java.util.Optional;

import com.example.cicero.entities.Empresa;

public interface EmpresaService {
	/**
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);

	/**
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);

}
