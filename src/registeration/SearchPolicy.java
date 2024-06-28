package registeration;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Scanner;

public class SearchPolicy {
	static void SearchPersonByPolicy(LinkedHashMap<String,LinkedHashMap<String, BasePolicyDo>> policyMap){
		System.out.println("Enter a partyseq ");
		Scanner sc = new Scanner(System.in);
		String partyseq = sc.next();
		LinkedHashMap<String, BasePolicyDo> hashMap = policyMap.get(partyseq);
		System.out.println("The policy for given party seq is " + partyseq);
		for(Map.Entry<String, BasePolicyDo> entry : hashMap.entrySet()){
			BasePolicyDo policy = entry.getValue();
			if(policy instanceof TermInsuranceDo){
				TermInsuranceDo term = (TermInsuranceDo) policy;
				System.out.println(term);
			}
			else if(policy instanceof HealthInsuranceDo){
				HealthInsuranceDo health = (HealthInsuranceDo) policy;
				System.out.println(health);
			}
			BasePolicyDo tnc= new BasePolicyDo(partyseq);
			System.out.println("Disclaimer:- \n");
			tnc.disclaimerMessage();
		}
	}
}
		    

//			
		       			