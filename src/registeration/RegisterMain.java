package registeration;

import java.util.ArrayList;

import java.util.Date;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;  
import java.util.Scanner;
import com.c2lbiz.symbiosys.systemcommon.util.DateUtil;
import com.sun.corba.se.pept.transport.ContactInfoList;
public class RegisterMain {
	

	
	void register(PartyDo userobj){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter partyTypeCd: \n1.indiviual \n2.organization");	
		String PartyType = sc.nextLine();
		if("1".equals(PartyType)){
			userobj.setPartyTypeCd("Indiviual");
		}
		else userobj.setPartyTypeCd("organization");
//		userobj.setPartyTypeCd(party);
		
		System.out.println("Your  partySeq: ");
		userobj.setPartySeq(Integer.toString(SingletonSequenceGenerator.getInstance().partyseq++));
		System.out.println(userobj.getPartySeq());
		
		System.out.println("Enter title: \n1.Mr \n2.Ms  \n3.Miss ");
		String Title = sc.nextLine();
		if("Mr".equals(Title)){
			userobj.setGenderCd("Male");
		}
		else if("Ms".equals(Title) || "Miss".equals(Title)){
			userobj.setGenderCd("Female");
		}
		else userobj.setGenderCd("Other");
		
		userobj.setTitle(Title);
		 
		 System.out.println("Enter First Name: ");
		 while(true){
			 String firstName  = sc.nextLine();
			 if(firstName.isEmpty()){
				 System.out.println("The name should not be empty");
			 }
			 else if(!checkName(firstName)){
				 System.out.println("The name should contain only alphabet");
			 } else {
				 userobj.setFirstName(firstName);
				 break;
		 	}
		 }
		 while(true){
			 System.out.println("Enter Last Name: ");
			 String lastName  = sc.nextLine();
			 if(lastName.isEmpty()){
				 System.out.println("The name should not be empty");
			 }
			 else if(!checkName(lastName)){
				 System.out.println("The name should contain only alphabet");
			 } else {
				 userobj.setLastName(lastName);
				 break;
		 	}
		 }
		 while(true){
		 System.out.println("Enter date:-");
		 String dateStr  = sc.nextLine();
		 
		 DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = null;
			try {
				date = dateformat.parse(dateStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date today = new Date();
			if(date.after(today)){
				System.out.println("Inavlid date of birth");
			}
			else {
				userobj.setAge(UtilDate.getAge(date, today));
				break;
			}
		 }
		 
		 
		 while(true){
			 PartyAddressDo addr = new PartyAddressDo();
			 System.out.println("Enter the address details:- ");
			 System.out.println("Your partyAddressSeq is:-");
			 addr.setPartyAddressSeq(Integer.toString(SingletonSequenceGenerator.getInstance().partyAddressseq++));
			 System.out.println(addr.getPartyAddressSeq());
			 System.out.println("The partySeq is:-");
			 addr.setPartySeq(userobj.getPartySeq());
			 System.out.println(addr.getPartySeq());
			 System.out.println("addressType:- \n1.Residential \n2.office");
			 String address = sc.nextLine();
			 if("1".equals(address)){
				 addr.setAdressType("Residential");
			 }
			 else if("2".equals(address)) {
				 addr.setAdressType("office");
			 }
			 else {
				 addr.setAdressType("Other");
			 }
			
			 System.out.println("Enter addressDetails:-");
			 addr.setAddressdetails(sc.nextLine());
			 CountryState.countryStates(addr);
			 System.out.println("Enter pincode:-");
			 addr.setPincode(sc.nextLine());
			 System.out.println("Primary address");
			 addr.setPrimaryAddress(sc.nextLine());
			 
			 userobj.getAddArr().add(addr);
			 
			 System.out.println("Do you want to continue?");
			 String ans = sc.nextLine();
			 if(ans.equals("no")){
				 boolean check = checkprimary(userobj);
				 if(check == false){
					 setprimary(userobj);
					 break;
				 } else {
					 break;
				 }
			 }
			 
		 }
		 
		 //Contact registration
		 while(true){
				PartyContactDo contactList = new PartyContactDo();
				System.out.println("Enter the Contact Details :-");
				System.out.println("Your Contact seq is ");
				contactList.setPartyContactseq(Integer.toString(SingletonSequenceGenerator.getInstance().contactseq++));
				System.out.println(contactList.getPartyContactseq());
				System.out.println("Enter the Contact Type \n1.Mobile \n2.Residential \n3.Office");
				String input = sc.next();
				if("1".equalsIgnoreCase(input)) contactList.setContactType("Mobile");
				else if("2".equalsIgnoreCase(input)) contactList.setContactType("Residential");
				else if("3".equalsIgnoreCase(input)) contactList.setContactType("Office");
				else System.out.println("Enter valid type");
				while(true){
				System.out.println("Enter the contact number:-");
				String number = sc.next();
					if(checkNum(number)) {
						contactList.setContactNum(number);
						break;
					}
					else {
						System.out.println("Invalid Number");
					}
				}
				userobj.getContArr().add(contactList);
				
				System.out.println("Do you want to continue?");
				String ans = sc.next();
				if(ans.equalsIgnoreCase("no")){
					break;
				}
			
			}	
		 System.out.println("The user details are :-" + userobj);
	}
	
	
	
	public boolean checkName(String str) {
		 return ((str != null) && (!str.equals(""))
	                && (str.matches("^[a-zA-Z]*$")));
	}
	public boolean checkNum(String str){
	    return str != null && str.matches("\\d{1,10}") && str.length() == 10;
	}
	public void setprimary(PartyDo userobj) {
		while(true){
		Scanner scc = new Scanner(System.in);
		System.out.println(userobj);
		System.out.println("which addres do you want to make it primary?  Enter the seq number");
		String parseq = scc.nextLine();
		Boolean flag = false;
		for(PartyAddressDo p : userobj.getAddArr()){
			if(parseq.equals(p.getPartyAddressSeq())) {
				p.setPrimaryAddress("yes");
				flag = true;
				break;
			}
			else System.out.println("please enter a valid party sequence");
			}
		if(flag == true) break;
		}
	}
	public boolean checkprimary(PartyDo obj){
//		ArrayList<PartyAddressDo> checkaddressList =  obj.getAddArr();
		
		boolean foundprimary = false;
		
		for(PartyAddressDo p :obj.addArr){
			if("yes".equals(p.getPrimaryAddress())){
				foundprimary = true;
			}
			
		}
		return foundprimary;
	}
}
