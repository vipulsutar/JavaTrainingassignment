package registeration;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SeachByName {
	public static void searchname(LinkedHashMap<String, PartyDo>lhm ){
		System.out.println("Enter the name you want to search:-");
		Scanner sc = new Scanner(System.in);
		String ans = sc.next();
		for(Map.Entry<String, PartyDo>entries : lhm.entrySet()){
			PartyDo user = entries.getValue();	
			if(ans.equalsIgnoreCase(user.getFirstName())){
				System.out.println(user);
				
			}
		}
	}
}
