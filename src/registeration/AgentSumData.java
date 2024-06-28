package registeration;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;



public class AgentSumData {
	public static void agentsum(LinkedHashMap<String, LinkedHashMap<String, BasePolicyDo>>policyMap){
		System.out.println("Enter the agent Id");
		Scanner sc = new Scanner(System.in);
		String ans = sc.next();
		double sum = 0;
		
		for(Map.Entry<String,LinkedHashMap<String, BasePolicyDo>> entries : policyMap.entrySet()){
			LinkedHashMap<String, BasePolicyDo> agentValues = entries.getValue();
			
			for(Map.Entry<String, BasePolicyDo> user : agentValues.entrySet()){
				if(user.getValue() instanceof TermInsuranceDo){
					if(((TermInsuranceDo)user.getValue()).agentseq.equals(ans))
					{
					sum += ((TermInsuranceDo)user.getValue()).getSumassured();
					}
				}
				else if(user.getValue() instanceof HealthInsuranceDo){
					if(((HealthInsuranceDo)user.getValue()).agentseq.equals(ans)){
						sum += ((HealthInsuranceDo)user.getValue()).getSumassured();
					}
				}
			}
			System.out.println("The Total Sum of Given Agent is " +  sum);
		}
		
	}
}
