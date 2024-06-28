package registeration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class DeleteAddressType {
	public static void deleteaddresstype(LinkedHashMap<String, PartyDo>lhm){
		for(Map.Entry<String, PartyDo>entries : lhm.entrySet()){
			PartyDo user = entries.getValue();
			PartyAddressDo remove;
			
			ArrayList<PartyAddressDo> addressList = user.getAddArr();
			Iterator<PartyAddressDo>iterator = addressList.iterator();
			while(iterator.hasNext()){
				PartyAddressDo addressIn = iterator.next();
				if(addressIn.getAdressType().equalsIgnoreCase("Residential")){
					iterator.remove();
				}
			}
			System.out.println(addressList);
		}
	}
}
