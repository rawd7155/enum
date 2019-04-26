package com.aca;

public class BrowserTest 
{
//	You can do this but it's kinda weird...
//	enum BrowserType { Chrome("Google"), IE("Microsoft"), Firefox();
//		
//		private String ownerName;
//		
//		private BrowserType(String ownerName)
//		{
//			this.ownerName = ownerName;
//		}
//		
//		private BrowserType()
//		{
//			ownerName = "Don't Care";
//		}
//
//		public String getOwnerName() 
//		{
//			return ownerName;
//		}
//	}

	BrowserType test1;
	
	public static void main(String[] args) 
	{
		BrowserTest bt = new BrowserTest();
		
		bt.displayEnum(BrowserType.Chrome);
	}
	
	public void demo()
	{
		printEnums();
		
		
	}

	public void printEnums()
	{
		for(BrowserType type : BrowserType.values())
		{
			System.out.println("\nBrowser Type: " + type);
			System.out.println(type + " is owned by " + type.getOwnerName());
		}
	}
	
	private void displayEnum(BrowserType bt)
	{
		switch(bt)
		{
			case IE :
				System.out.println("This one stinks");
				break;
			case Chrome :
				System.out.println("Winner Winner");
				break;
			case Firefox :
				System.out.println("Can't help you");
				break;
		}
	}

}


