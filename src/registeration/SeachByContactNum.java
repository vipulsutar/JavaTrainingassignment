package registeration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SeachByContactNum {
	public static void searchbycontactnum(LinkedHashMap<String, PartyDo>lhm){
		System.out.println("Enter the Contact Number you want to search:-");
		Scanner sc = new Scanner(System.in);
		String ans = sc.next();
		for(Map.Entry<String, PartyDo>entries : lhm.entrySet()){
			PartyDo user = entries.getValue();
			
			ArrayList<PartyContactDo>contactList = user.getContArr();
			for(PartyContactDo contactIn : contactList){
				if(ans.equalsIgnoreCase(contactIn.getContactNum())){
					System.out.println(user);
				}
				else System.out.println("user does not exist");
			}
		}
	}
}
