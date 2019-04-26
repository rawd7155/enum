package com.aca;

public enum BrowserType { Chrome("Google"), IE("Microsoft"), Firefox();
	
	private String ownerName;
	
	private BrowserType(String ownerName)
	{
		this.ownerName = ownerName;
	}
	
	private BrowserType()
	{
		ownerName = "Don't Care";
	}

	public String getOwnerName() 
	{
		return ownerName;
	}
}
