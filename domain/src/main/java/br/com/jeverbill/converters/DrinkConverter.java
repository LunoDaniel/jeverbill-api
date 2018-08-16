package br.com.jeverbill.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.jeverbill.domain.Drink;
import br.com.jeverbill.dto.DrinkDTO;

@Component
public class DrinkConverter implements Converter<Drink, DrinkDTO>{
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public DrinkDTO convert(Drink drink) {
		return modelMapper.map(drink, DrinkDTO.class);
	}
	
	public Drink convertToDrink(DrinkDTO drinkDTO) {
		return modelMapper.map(drinkDTO, Drink.class);
	}

}

