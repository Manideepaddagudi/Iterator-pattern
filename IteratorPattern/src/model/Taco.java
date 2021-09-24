package model;

public class Taco {

	String taco_Name;
	String taco_Type;
	String topping_sauce;
	String taco_topping;

	public Taco(String taco_Name, String taco_Type, String topping_sauce, String taco_topping) {
		this.taco_Name = taco_Name;
		this.taco_Type = taco_Type;
		this.topping_sauce = topping_sauce;
		this.taco_topping = taco_topping;

	}

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

	@Override
	public String toString() {
		return "Taco [taco_Name=" + taco_Name + ", taco_Type=" + taco_Type + ", topping_sauce=" + topping_sauce
				+ ", taco_topping=" + taco_topping + "]";
	}

}
