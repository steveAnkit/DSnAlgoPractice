class ReverseString{
	
	
	public static void main(String[] args)
	{
			
			String str = "ankit";
			ReverseString obj = new ReverseString();
			obj.reverse(str);
			
			
		
	}
	
	void reverse(String str)
	{
		if((str == null) || str.length() <=1)
		{
			System.out.print(str);
		}
		else
		{
			System.out.print(str.charAt(str.length() -1));
			reverse(str.substring(0,str.length() -1));
		}
	}
	
	
}