package com.ben.Priniciple.OCP;

public class MenShoe implements IShoe {

	private String name;
	private String type;
	private int value;

	public MenShoe(String name, String type, int value) {
		super();
		this.name = name;
		this.type = type;
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
		// TODO Auto-generated method stub
		return this.value;
	}

}
