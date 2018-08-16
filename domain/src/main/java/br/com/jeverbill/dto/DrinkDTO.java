package br.com.jeverbill.dto;

import br.com.jeverbill.enums.DrinkType;

public class DrinkDTO {

	private Long id;
	private String name;
	private Double value;
	private DrinkType type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public DrinkType getType() {
		return type;
	}

	public void setType(DrinkType type) {
		this.type = type;
	}

}
