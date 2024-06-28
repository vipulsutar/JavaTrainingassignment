package registeration;

import java.util.LinkedHashMap;

public class DisplayMain {
	public static  void Display(LinkedHashMap<String, PartyDo> lhm){
			for(String key : lhm.keySet()){
				PartyDo val = lhm.get(key);
				System.out.println("The details are " + val);			
			}
		}
	}
