package br.com.jeverbill.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.jeverbill.domain.Drink;
import br.com.jeverbill.repository.interfaces.Drinks;
import br.com.jeverbill.service.exceptions.BusinessException;
import br.com.jeverbill.service.interfaces.BaseService;

public class DrinkServiceImpl<T> implements BaseService<Drink>{
	
	@Autowired
	private Drinks drinks;

	@Override
	public Drink save(Drink drink) throws BusinessException {
		return drinks.save(drink);
	}

	@Override
	public Drink findOne(Long id) throws BusinessException {
		return drinks.getOne(id);
	}

	@Override
	public List<Drink> findAll() throws BusinessException {
		return drinks.findAll();
	}

	@Override
	public void delete(Drink drink) throws BusinessException {
		drinks.delete(drink);
	}
	

}
