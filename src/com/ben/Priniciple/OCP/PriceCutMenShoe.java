package com.ben.Priniciple.OCP;

public class PriceCutMenShoe extends MenShoe {

	public PriceCutMenShoe(String name1, String type1, int value1) {
		super(name1, type1, value1);
	}

	@Override
	public int getValue() {
		int primeCost = super.getValue();
		int cutPrice = 0;
		if (primeCost > 200) {
			cutPrice = primeCost * 80 / 100;
		}
		if (primeCost > 150) {
			cutPrice = primeCost * 85 / 100;
		} else {
			cutPrice = primeCost * 90 / 100;
		}
		return cutPrice;
	}

}
