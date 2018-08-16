package br.com.jeverbill.dto;

import java.util.List;

import br.com.jeverbill.domain.Drink;
import br.com.jeverbill.domain.Food;
import br.com.jeverbill.domain.People;

public class BillDTO {

	private Long id;
	private List<Drink> drinks;
	private List<Food> foods;
	private List<People> people;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Drink> getDrinks() {
		return drinks;
	}

	public void setDrinks(List<Drink> drinks) {
		this.drinks = drinks;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public List<People> getPeople() {
		return people;
	}

	public void setPeople(List<People> people) {
		this.people = people;
	}

}
