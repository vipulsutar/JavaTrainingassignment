package registeration;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SearchMain {
	void Search(LinkedHashMap<String, PartyDo>lhm){
		
		boolean flag = false;
		try {
			while(true){
				System.out.println("Enter the sequence number of detail which you want to Search");
				Scanner sc = new Scanner(System.in);
				String partySeq = sc.nextLine();
				CustonException.validate(partySeq,lhm);
					PartyDo user = lhm.get(partySeq);
					System.out.println("The user details are:- ");
					System.out.println(user);
					break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception occured " + e);
		}
	}
}
