package registeration;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class BuyPolicy {
    void buypolicy(LinkedHashMap<String, LinkedHashMap<String, BasePolicyDo>> policyMap, LinkedHashMap<String, PartyDo> lhm,LinkedHashMap<String, AgentDo> AgentsMap) {
        System.out.println("Enter the partyseq:");
        Scanner sc = new Scanner(System.in);
        String partyseq = sc.next();	
        
        while (true) {
            if (lhm.containsKey(partyseq)) {
                String policyseq = String.valueOf(SingletonSequenceGenerator.getInstance().policyseq);
                System.out.println("Enter the sum assured:");
                double sumassured = sc.nextDouble();
                
                System.out.println("Enter a policy which you want to Buy:");
                System.out.println("\n1.TermInsurance \n2.HealthInsurance");
                String choice = sc.next(); 
                
                if ("1".equalsIgnoreCase(choice)) {
                    LinkedHashMap<String, BasePolicyDo> hashMap = policyMap.get(partyseq);
                    if(hashMap == null) hashMap = new LinkedHashMap<String, BasePolicyDo>();
                    if (hashMap.containsKey("TermInsurance")) {
                        System.out.println("TermInsurance already exists");
                        return;
                    }
                    double premiumamt = premiumCalculationDo.premiumCalTermins(sumassured); // Assuming this is properly initialized
                    
                    SingletonSequenceGenerator.getInstance().policyseq++;
                    System.out.println("Enter the agent from whom you want to buy the policy:- ");    

                    for(String key : AgentsMap.keySet()){
                    	System.out.println(key + " " + AgentsMap.get(key).getAgentName());
                    }
                    String ans = sc.next();
                    TermInsuranceDo termInsurance = new TermInsuranceDo(partyseq, policyseq, sumassured,ans);
                    termInsurance.setPremiumamt(premiumamt);
                    hashMap.put("TermInsurance", termInsurance);
                    policyMap.put(partyseq, hashMap);
                    break;
                } else if ("2".equalsIgnoreCase(choice)) {
                    LinkedHashMap<String, BasePolicyDo> hashMap = policyMap.get(partyseq);
                    if(hashMap == null) hashMap = new LinkedHashMap<String, BasePolicyDo>();
                    if (hashMap.containsKey("HealthInsurance")) {
                        System.out.println("HealthInsurance already exists");
                        return;
                    }
                    double premiumamt = premiumCalculationDo.premiumCalHealthins(sumassured); // Assuming this is properly initialized
                    System.out.println("Enter the agent from whom you want to buy the policy:- ");    
                    System.out.println(AgentsMap);
                    String ans = sc.next();
                    SingletonSequenceGenerator.getInstance().policyseq++;
                    HealthInsuranceDo healthInsurance = new HealthInsuranceDo(partyseq, policyseq, sumassured,ans);
                    healthInsurance.setPremiumamt(premiumamt);
                    healthInsurance.setHealthcover((5/100)*sumassured);
                    hashMap.put("HealthInsurance", healthInsurance);
                    policyMap.put(partyseq, hashMap);
                    break;
                } else {
                    System.out.println("Enter a valid Policy Type");
                    continue;
                }
            } else {
                System.out.println("Enter a valid partyseq");
                partyseq = sc.next(); 
            }
        }
    }
}
