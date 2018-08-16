package br.com.jeverbill.converters;

import org.springframework.stereotype.Component;

import br.com.jeverbill.domain.Bill;
import br.com.jeverbill.dto.BillDTO;

import org.springframework.core.convert.converter.Converter;

@Component
public class BillConverter implements Converter<BillDTO, Bill>{

	@Override
	public Bill convert(BillDTO source) {
		return null;
	}

}
