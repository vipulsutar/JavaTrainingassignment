package registeration;

import java.util.LinkedHashMap;



public class CustonException {
	public static void validate(String s,LinkedHashMap<String, PartyDo>lhm) throws InvalidUserException{
		if(!lhm.containsKey(s)){
			throw new InvalidUserException("not Found");
		}
		else System.out.println("works");	}
}
