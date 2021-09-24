package model;

public class MXStyleVeggieTaco {

	String taco_Name = "MXVEGGIE TACO";
	String taco_Type = "VEGGIE";
	String topping_sauce = "VEGGIE SAUCE";
	String taco_topping = "ONION VEGGIE";

	public String getTaco_Name() {
		return taco_Name;
	}

	public void setTaco_Name(String taco_Name) {
		this.taco_Name = taco_Name;
	}

	public String getTaco_Type() {
		return taco_Type;
	}

	public void setTaco_Type(String taco_Type) {
		this.taco_Type = taco_Type;
	}

	public String getTopping_sauce() {
		return topping_sauce;
	}

	public void setTopping_sauce(String topping_sauce) {
		this.topping_sauce = topping_sauce;
	}

	public String getTaco_topping() {
		return taco_topping;
	}

	public void setTaco_topping(String taco_topping) {
		this.taco_topping = taco_topping;
	}

	void preparing() {

		System.out.println("Preparing Taco " + getTaco_Name());
	}

	void addingSauce() {

		System.out.println("Adding topping_sauce " + getTopping_sauce());
	}

	void addingtoppings() {
		System.out.println("Adding taco_topping " + getTaco_topping());
	}

	void packing() {
		System.out.println("Packing " + getTaco_Name());
	}

	@Override
	public String toString() {
		return "MXStyleVeggieTaco [taco_Name=" + taco_Name + ", taco_Type=" + taco_Type + ", topping_sauce="
				+ topping_sauce + ", taco_topping=" + taco_topping + "]";
	}

}
