package com.ben.Priniciple.OCP;

public class PriceCutGirlShoe extends GirlShoe {

	public PriceCutGirlShoe(String name2, String type2, int value2) {
		super(name2, type2, value2);
	}

	@Override
	public int getValue() {
		int primeCost = super.getValue();//这是重点的一句
		int cutPrice = 0;
		if(primeCost > 200){
			cutPrice = primeCost*75/100;
			System.out.println("原价大于200，打75折~~~~");
		}
		if(primeCost >150){
			cutPrice = primeCost*80/100;
			System.out.println("原价大于150，打8折~~~~");
		}
		else{
			cutPrice = primeCost*85/100;
			System.out.println("原价大于100，打85折~~~~");
		}
		return cutPrice;
	}
	
}
