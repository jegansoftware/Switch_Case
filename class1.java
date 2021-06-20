//file name should be named as switch1.java
package Switch;
import java.util.*;
public class switch1 {
	private String num;
    Scanner in=new Scanner(System.in);
	
    public void head()
    {
    System.out.printf("\nJegan Software Solution 's recruitment");  
    System.out.printf("\n--------------------------------------\n\n");
    }
    
    
	public void swit()
	{
		System.out.printf("\nEnter Your Roll Number:");
		num=in.nextLine();
		switch(num)
		{
		case "1":
			System.out.printf("\nYou was designated As Back end Developer");
			break;
		case "2":
		case "3":
			System.out.printf("\nYou was designated as front end Developer");
			break;
		
		case "4":
			System.out.printf("\nYou have been designated as designer");
			//break;
		}
		in=null;
	}
    
}
