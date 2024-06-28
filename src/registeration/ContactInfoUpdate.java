package registeration;

import java.util.Scanner;

public class ContactInfoUpdate {
	public static void contactInfo(PartyDo obj){
		System.out.println("Enter the sequenec number you want to update :- ");
		System.out.println(obj.getContArr());
		Scanner sc = new Scanner(System.in);
		String partyseq = sc.nextLine();
		for(PartyContactDo userobj : obj.ContArr){
			if(userobj.partyContactseq.equalsIgnoreCase(partyseq)){
				boolean flag = false;
				while(true){
					System.out.println("What do you want to update ?");
					System.out.println("\n1.Contact Type \n2.Contact Number");
					if("1".equalsIgnoreCase(sc.next())){
						System.out.println("Enter the Contact Type \n1.Mobile \n2.Residential \n3.Office");
						String input = sc.next();
						if("1".equalsIgnoreCase(input)) userobj.setContactType("Mobile");
						else if("2".equalsIgnoreCase(input)) userobj.setContactType("Residential");
						else if("3".equalsIgnoreCase(input)) userobj.setContactType("Office");
						else System.out.println("Enter valid type");
						flag = true;
					}
					else if("2".equalsIgnoreCase(sc.next())){
						System.out.println("Enter the contact number:-");
						userobj.setContactNum(sc.next());
						flag = true;
					}
					else {
						System.out.println("Input is Invalid");
						continue;
					}
					if(flag == true) break;
				}
			}
		}
	}
}
