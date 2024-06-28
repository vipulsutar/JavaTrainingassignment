package registeration;

import java.util.LinkedHashMap;
import java.util.Map;

public class DeleteByAge {
	public static void deletebyage(LinkedHashMap<String, PartyDo>lhm){
		for(Map.Entry<String, PartyDo> entries : lhm.entrySet()){
			PartyDo user = entries.getValue();
			if(user.getAge() < 18){
				lhm.remove(user);
			}
			System.out.println(lhm);
		}
	}


}
