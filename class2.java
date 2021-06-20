//file name must be named as lnformation.java
package Switch;
import java.util.*;
public class Information {
	private String l="";
	Scanner j=new  Scanner(System.in);
	
	public void info()
	{
		System.out.printf("\n\nTo know information ,Please Enter \"Yes\":: ");
		l=j.nextLine();
		
		l=l.toUpperCase();
		
		switch(l)
		{
		case "YES":
			System.out.println("\n1)You Must join on july 24 2021");
			System.out.println("\n2)Resume Must be brought");
			System.out.println("\n3)Rs.25,000 Will be Given as Monthly Salary");
			break;
		}
	}
	

}
