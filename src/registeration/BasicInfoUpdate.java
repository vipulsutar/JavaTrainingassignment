package registeration;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class BasicInfoUpdate {
	public static void basicInfo(PartyDo userobj){
		Scanner sc = new Scanner(System.in);
		boolean isoption = false;
		while(true){
		System.out.println("what you want to update here");
		System.out.println("1. partyType\t 2.Title\t 3.firstname\t 4.lastname\t 5.Dob\t 6.Gender");
			String input = sc.nextLine();
			if("1".equals(input)){
				 while(true){
					boolean istypecd = false;  
					System.out.println("Enter partyTypeCd: ");
					System.out.println("1. Individual");
					System.out.println("2. ORGANIZATION");
				    String par = sc.nextLine();
				    if("1".equals(par))
				    {
				    	userobj.setPartyTypeCd("Individual");
				    	istypecd= true;
				    }
				    else if("2".equals(par))
				    {
				    	userobj.setPartyTypeCd("Organization");
				    	istypecd= true;
				    }
				    else
				    {
				    	System.out.println("Enter valid partyTypeCd from option");
				    }
					 if(istypecd == true)break;

					}
				 isoption=true;
			}
			if("2".equals(input)){
				while(true){
					boolean istypetit = false; 
					System.out.println("Enter title : \n1.Mr \n2.Ms \n3.Mrs");
					String titleinput = sc.nextLine();
					if("1".equals(titleinput))
				    {
				    	userobj.setTitle("Mr");
				    	istypetit= true;
				    }
				    else if("2".equals(titleinput))
				    {
				    	userobj.setTitle("Ms");
				    	istypetit= true;
				    }
				    else if("3".equals(titleinput))
				    {
				    	userobj.setTitle("Mrs");
				    	istypetit= true;
				    }
				    else 
				    {
				    	System.out.println("Enter valid title from option");
				    }
					 if(istypetit == true) break;
					}
				isoption=true;
			}
			if("3".equals(input)){
	        	boolean fname= false;
	    		while(true){
	    		System.out.println("Enter firstName");
	    		String firstname = sc.nextLine();
	    		if (!firstname.isEmpty() && firstname.matches("[a-zA-Z]+")){
	    		userobj.setFirstName(firstname);
	    		fname = true;
	    		}
	    		else {System.out.println("Enter valid firstname");
	    		continue;}
	    		if (fname ==true) break; 
	    		}
	        	isoption=true;
			}
			if(isoption == true) break;
		}
	}
}
