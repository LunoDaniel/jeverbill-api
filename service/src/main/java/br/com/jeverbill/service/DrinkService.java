package br.com.jeverbill.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.jeverbill.converters.DrinkConverter;
import br.com.jeverbill.domain.Drink;
import br.com.jeverbill.dto.DrinkDTO;
import br.com.jeverbill.service.exceptions.BusinessException;
import br.com.jeverbill.service.impl.DrinkServiceImpl;

public class DrinkService extends DrinkServiceImpl<Drink>{

	@Autowired
	private DrinkConverter converter;

	public Drink saveDrink(DrinkDTO drinkDto) throws BusinessException {
		Drink drink = converter.convertToDrink(drinkDto);
		return super.save(drink);
	}

	
}
