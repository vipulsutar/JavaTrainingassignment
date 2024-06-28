package registeration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindByPartyType {
	public static void  findpartytypecd(LinkedHashMap<String, PartyDo>lhm){
	System.out.println("Enter the Party Type you want to search:-");
	Scanner sc = new Scanner(System.in);
	String ans = sc.next();
		for(Map.Entry<String, PartyDo> entries : lhm.entrySet()){
			PartyDo user  = entries.getValue();
			
			System.out.println(user.getPartyTypeCd());
			if(ans.equalsIgnoreCase(user.getPartyTypeCd())){
//				partyseqType.add(user.getPartySeq());
//				partyseqType.add(Integer.toString(user.getAge()));
//				partyseqType.add(user.getGenderCd());
				System.out.println(user);
				
			}
		}
	}
}
