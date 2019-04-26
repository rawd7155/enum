package com.aca;

// The int next to each one is being passed in as the itemNumber.
public enum WinProduct { DISH(1), HSI(2), DirecTV(3);
	
	private int itemNumber;

	private WinProduct(int itemNumber)
	{
		this.itemNumber = itemNumber;
	}

	public int getItemNumber() 
	{
		return itemNumber;
	}
	
//	@Override
//	public static WinProduct valueOf(String value)
//	{
//		
//	}
	
}
