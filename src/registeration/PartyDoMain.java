package registeration;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import java.util.Scanner;

import javax.naming.directory.SearchControls;


public class PartyDoMain {

	public static void main(String[] args) 
	{
		LinkedHashMap<String, PartyDo> lhm = new LinkedHashMap<String, PartyDo>();
		LinkedHashMap<String, AgentDo> AgentsMap = new LinkedHashMap<String, AgentDo>();
		
		LinkedHashMap<String,LinkedHashMap<String, BasePolicyDo>> policyMap = new LinkedHashMap<String,LinkedHashMap<String, BasePolicyDo>>();
		
		LinkedHashMap<String,BasePolicyDo> hashMap = new LinkedHashMap<String, BasePolicyDo>();
		
		
		while(true){
		System.out.println("Enter the operation which You want to perform :- " +
				"\n1.Create \n2.Update \n3.Delete \n4.Search \n5.Download \n6.Display \n7.Buy Policy");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		AgentCreation.createAgent(AgentsMap);
			switch (n) {
			case 1:
				PartyDo obj=new PartyDo();
				RegisterMain r = new RegisterMain();
				r.register(obj);
				lhm.put(obj.partySeq, obj);
				break;
			case 2:
				UpdateMain up = new UpdateMain();
				System.out.println("What to you want to update \n1.UserDetails \n2.Premium");
				String update = sc.next();
				if("1".equalsIgnoreCase(update)){
					up.update(lhm);
				}
				else if("2".equalsIgnoreCase(update)){
					UpdatePrem.updatePremium(policyMap);
				}
				break;
			case 3:
				DeleteMain del = new DeleteMain();
				del.Delete(lhm);
				break;
			case 4:
				SearchMain se = new SearchMain();
				System.out.println("What do you want to search \n1.UserDetails \n2.UserPolicies \n3.ByName \n4.By Party Type \n5.By State \n6.By Contact Type");
				String search  = sc.next();
				if("1".equalsIgnoreCase(search)){
					se.Search(lhm);
				}
				else if("2".equalsIgnoreCase(search)){
					SearchPolicy.SearchPersonByPolicy(policyMap);
				}
				else if("3".equalsIgnoreCase(search)){
					SeachByName.searchname(lhm);
				}
				else if("4".equalsIgnoreCase(search)){
					FindByPartyType.findpartytypecd(lhm);
				}
				else if("5".equalsIgnoreCase(search)){
					FindByStates.findbystates(lhm);
				}
				else if("6".equalsIgnoreCase(search)){
					SeachByContactNum.searchbycontactnum(lhm);
				}
				else System.out.println("Invalid Input");
				break;
			case 5:
				DownloadMain down = new DownloadMain();
				down.Download(lhm);
				break;
			case 6:
				DisplayMain show = new DisplayMain();
				show.Display(lhm);
				break;
			case 7:
				BuyPolicy buy = new BuyPolicy();
				buy.buypolicy(policyMap,lhm,AgentsMap);
				break;
			case 8:
				DeleteAddressType.deleteaddresstype(lhm);
				System.out.println(lhm);
			case 9:
				DeleteByAge.deletebyage(lhm);
				System.out.println(lhm);
				break;
			case 10:
				AgentSumData.agentsum(policyMap);
				break;
			default:
				System.out.println("Thank you");
				break;
			}
		}		
	}
}
