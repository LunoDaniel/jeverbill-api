package br.com.jeverbill.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.jeverbill.dto.DrinkDTO;

@Component
public class DrinkValidator implements Validator{
	
	private static final String FIELD_REQUIRED = "field.required";

	@Override
	public boolean supports(Class<?> clazz) {
		return DrinkDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", FIELD_REQUIRED);
		ValidationUtils.rejectIfEmpty(errors, "value", FIELD_REQUIRED);
		ValidationUtils.rejectIfEmpty(errors, "type", FIELD_REQUIRED);
	}

}
