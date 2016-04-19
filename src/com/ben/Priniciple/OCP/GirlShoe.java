package com.ben.Priniciple.OCP;

public class GirlShoe implements IShoe {

	private String name;
	private String type;
	private int value;

	public GirlShoe(String name, String type, int value) {
		super();
		this.name = name;
		this.type = type;
		this.value = value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public int getValue() {
		return this.value;
	}

}
