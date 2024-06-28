package registeration;

import java.util.Scanner;

public class addressInfoUpdate {
	public static void addressInfo(PartyDo obj){
		System.out.println("Enter the sequenec number you want to update :- ");
		System.out.println(obj.getAddArr());
		Scanner sc = new Scanner(System.in);
		String partyseq = sc.nextLine();
		for(PartyAddressDo userobj : obj.addArr){
			if(userobj.getPartyAddressSeq().equals(partyseq)){
				boolean flag = false;
				while(true){
					System.out.println("What do you want tp update?");
					System.out.println("\n1.addressType \n2.Country \n3.state \n4.addressdetails \n5.Primary Address \n6.PinCode");
					
					String input = sc.nextLine();
					if("1".equals(input)){
						System.out.println("addressType:- \n1.Residential \n2.office");
						 String address = sc.nextLine();
						 if("1".equals(address)){
							 userobj.setAdressType("Residential");
						 }
						 else if("2".equals(address)) {
							 userobj.setAdressType("office");
						 }
						 else {
							 userobj.setAdressType("Other");
						 }
						flag = true;
						System.out.println(userobj);
					}
					else if("2".equals(input)){
						String s = CountryState.countryStates(userobj);
						System.out.println(userobj);
						flag = true;
					}
					else {
						System.out.println("Give a valid input");
						continue;
					}
					if(flag == true) break;
				}
			}
		}
	}
}
