package registeration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindByStates {
	public static void findbystates(LinkedHashMap<String, PartyDo>lhm){
		System.out.println("Enter the State users you want to search:-");
		Scanner sc = new Scanner(System.in);
		String ans = sc.next();
		for(Map.Entry<String, PartyDo>entries : lhm.entrySet()){
			PartyDo user = entries.getValue();
			ArrayList<PartyAddressDo>state = user.getAddArr();
			for(PartyAddressDo statesIn : state){
				if(statesIn.getStateCd().equalsIgnoreCase(ans)){
					System.out.println(user);
				}
			}
		}
	}
}
