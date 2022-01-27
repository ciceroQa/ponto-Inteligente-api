package com.example.cicero.impl;

import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.cicero.entities.Empresa;
import com.example.cicero.repositories.EmpresaRepository;
import com.example.cicero.services.EmpresaService;

public class EmpresaServiceImpl implements EmpresaService {

	private static final Logger log = (Logger) LoggerFactory.getLogger(EmpresaServiceImpl.class);

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Buscando uma empresa pelo cnpj{}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo empresa:{}", empresa);
		return this.empresaRepository.save(empresa);
	}

}
