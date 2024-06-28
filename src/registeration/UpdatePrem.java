package registeration;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class UpdatePrem {
	 public static void updatePremium(LinkedHashMap<String,LinkedHashMap<String, BasePolicyDo>> policyMap ) 
	    {
	        for (Map.Entry<String, LinkedHashMap<String, BasePolicyDo>> entry : policyMap.entrySet()) 
	        {
	            LinkedHashMap<String, BasePolicyDo> hashMap = entry.getValue();
	 
	            for (Entry<String, BasePolicyDo> policyEntry : hashMap.entrySet()) 
	            {
	            		BasePolicyDo policy = policyEntry.getValue();
	            		
	 
	                if (policy instanceof TermInsuranceDo)
	                {
	                	TermInsuranceDo termPolicy = (TermInsuranceDo) policy;
	                    double newPremium = termPolicy.getPremiumamt() * 1.05; 
	                    termPolicy.setPremiumamt(newPremium);
	                    System.out.println("The updated value is " + termPolicy.getPremiumamt());
	                } 
	                else if(policy instanceof HealthInsuranceDo) 
	                {
	                	HealthInsuranceDo healthPolicy = (HealthInsuranceDo) policy;
	                    double newPremium = healthPolicy.getPremiumamt() * 1.07; 
	                    healthPolicy.setPremiumamt(newPremium);
	                }
	            }
	        }
	    }
}
