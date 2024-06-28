package registeration;

import java.util.LinkedHashMap;
import java.util.Scanner;

import com.sun.corba.se.pept.transport.ContactInfo;
public class UpdateMain {
	void update(LinkedHashMap<String, PartyDo>lhm){
		boolean flag = false;
		while(true){
			System.out.println("Enter the Sequence Number you want to update:- ");
			Scanner sc = new Scanner(System.in);
			String partySeq = sc.nextLine();
			if(lhm.containsKey(partySeq)){
				PartyDo user = lhm.get(partySeq);
				while(true){	
					boolean isupdate = false;
					System.out.println(user);
					System.out.println("What do you want to update \n1.BasicInfo \n2.addressinfo \n3.ContactInfo");
					String updateStr = sc.nextLine();
					if("1".equals(updateStr)){
						BasicInfoUpdate.basicInfo(user);
						System.out.println(user);
						isupdate = true;
					}
					else if("2".equals(updateStr)){
						addressInfoUpdate.addressInfo(user);
						System.out.println(user);
						isupdate = true;
					}
					else if("3".equals(updateStr)){
						ContactInfoUpdate.contactInfo(user);
						isupdate = true;
					}
					else {
						System.out.println("Enter valid input");
						continue;
					}
					if(isupdate == true) break;
				}
				flag = true;
			}
			else {
				System.out.println("The Sequence Number is Invalid");
				continue;
			}
			if(flag == true) break;
		}
	}
}
