package registeration;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import java.util.Scanner;

public class CountryState {
	
	public static String countryStates(PartyAddressDo addr) {
		LinkedHashMap<String, ArrayList<String>> countryStateMap = new LinkedHashMap<String, ArrayList<String>>();
		ArrayList<String>IndiaStates = new ArrayList<String>();
		IndiaStates.add("Maharashtra");
		IndiaStates.add("Gujrat");
		IndiaStates.add("Punjab");
		IndiaStates.add("Delhi");
		IndiaStates.add("Karnataka");
		
		ArrayList<String>UsaStates = new ArrayList<String>();
		UsaStates.add("Texas");
		UsaStates.add("Calfornia");
		UsaStates.add("Florida");
		UsaStates.add("hawai");
		UsaStates.add("Ohio");
		
		countryStateMap.put("1",IndiaStates);
		countryStateMap.put("2",UsaStates);
		
		LinkedHashMap<String, String> countryNames = new LinkedHashMap<String, String>();
		
		countryNames.put("1","India");
		countryNames.put("2","USA");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Country");
		for(String key : countryNames.keySet()){
			System.out.println(key + " : " + countryNames.get(key));
		}
		String countrychoice = sc.nextLine();
		boolean flag = false;
		while(true){
		if(countryStateMap.containsKey(countrychoice)){
			flag  = true;
			addr.setCountryCd(countryNames.get(countrychoice));
			ArrayList<String>states = countryStateMap.get(countrychoice);
			
			System.out.println("Select State" + countryNames.get(countrychoice));
			for(int i=0;i<states.size();i++){
				System.out.println((i+1) + " : " + states.get(i));
			}
			int statechoice = sc.nextInt();
			boolean stateflag = false;
			while(true){
			if(statechoice > 0 && statechoice <= states.size()){
				addr.setStateCd(states.get(statechoice-1));
				stateflag = true;
			}
			else {
				System.out.println("Selected State is Inavalid");
				continue;
				}
			if(flag == true) break;
			}
		}
		else {
			System.out.println("Country selected is Invalid");
			continue;
		}
		if(flag == true) break;
		}
		return null;
	}
}
