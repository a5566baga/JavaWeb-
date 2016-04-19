package com.ben.Priniciple.SRP;

public class ProductService implements IProductEntity {

	@Override
	public String selectAll(String all) {
		String all1 = "Service全部查询";
		System.out.println(all + " Service查询");
		return all1;
	}

	@Override
	public String getYearMonth(String YearMonth) {
		return null;
	}

	@Override
	public String getName(String Name) {
		return null;
	}

	@Override
	public String getType(String Type) {
		return null;
	}

	@Override
	public String getBrand(String Brand) {
		return null;
	}

	@Override
	public int getValue(int Value) {
		return 0;
	}

	@Override
	public String getLocality(String Locality) {
		return null;
	}


}
