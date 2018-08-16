package br.com.jeverbill.enums;

public enum DrinkType {
	CHOPP("Chopp"), BEER("Cerveja"), DOSE("Dose");
	
	private String typeDesc;
	
	DrinkType(String desc){
		typeDesc = desc;
	}
	
	public String getTypeDesc() {
		return typeDesc;
	}
}
