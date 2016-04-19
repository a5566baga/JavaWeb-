package com.ben.Priniciple.SRP;

public interface IProductEntity {

	public String getYearMonth(String YearMonth);
	public String getName(String Name);
	public String getType(String Type);
	public String getBrand(String Brand);
	public int getValue(int Value);
	public String getLocality(String Locality);
	
	public String selectAll(String all);
	
}
