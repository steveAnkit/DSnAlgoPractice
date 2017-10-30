import java.util.*;

public class RemoveDuplicates{
	
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  String str = "";
	  str = sc.nextLine();
	  remove(str);
	  
	  
	}
	
	public static void remove(String str){
		
		Set<Character> lhs = new LinkedHashSet<Character>();
		for(int i=0; i < str.length(); i++)
		{
			lhs.add(str.charAt(i));
		}
		
		for(Character c: lhs)
		{
			System.out.print(c);
		}
		
	} 
}