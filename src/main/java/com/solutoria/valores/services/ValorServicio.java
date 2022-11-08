package com.solutoria.valores.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solutoria.valores.daos.ValorDao;
import com.solutoria.valores.models.Valor;

@Service
public class ValorServicio {

	@Autowired
	private ValorDao valorDao;

	public List<Valor> getAllValores() {
		return (List<Valor>) valorDao.findAll();
	}
	
	public Valor getValorById(Integer id) {
		return valorDao.findById( id ).orElse(null);
	}

	public Valor addValor(Valor valor) {
		return valorDao.save(valor);
	}

	public Valor updateValor(Valor valor) {
		Valor valorBd = valorDao.findById(valor.getId()).orElse(null);

		if (valorBd.equals(null)) {
			return valorBd;
		}

		return valorDao.save(valor);
	}

	public Valor deleteValorById(Integer id) {
		Valor valorBd = valorDao.findById(id).orElse(null);

		if (valorBd.equals(null)) {
			return valorBd;
		}
		try {
			valorDao.delete(valorBd);
			return valorBd;

		} catch (Exception err) {
			throw new Error(err);
		}
	}
	
	public boolean addValores( List<Valor> valores) {
		try {
			valorDao.saveAll( valores );
		} catch( Exception err ) {
			throw new Error(err);
		}
		return true;
	}
}
