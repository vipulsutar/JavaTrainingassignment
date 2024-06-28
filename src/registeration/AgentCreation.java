package registeration;

import java.util.LinkedHashMap;

public class AgentCreation {
	public static void createAgent(LinkedHashMap<String, AgentDo>AgentsMap){
		AgentDo agent1 = new AgentDo("1", "Vipul", "Powai");
		AgentDo agent2 = new AgentDo("2", "Golu","Lowar parel");
		AgentDo agent3 = new AgentDo("3", "Aryan", "Manchester");
		
		AgentsMap.put(agent1.getAgentseq(), agent1);
		AgentsMap.put(agent2.getAgentseq(), agent2);
		AgentsMap.put(agent3.getAgentseq(), agent3);
	}
}
