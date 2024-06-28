package registeration;

import java.util.ArrayList;

public class AgentDo {
	String Agentseq;
	String AgentName;
	String Location;
	int CountParties;
	double TotalSales;
	
	ArrayList<Double>agentSum =  new  ArrayList<Double>();
	ArrayList<Integer> contactList = new ArrayList<Integer>();
	
	public AgentDo(String agentseq, String agentName, String location) {
		super();
		this.Agentseq = agentseq;
		this.AgentName = agentName;
		this.Location = location;
	}

	public String getAgentseq() {
		return Agentseq;
	}

	public void setAgentseq(String agentseq) {
		Agentseq = agentseq;
	}

	public String getAgentName() {
		return AgentName;
	}

	public void setAgentName(String agentName) {
		AgentName = agentName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getCountParties() {
		return CountParties;
	}

	public void setCountParties(int countParties) {
		CountParties = countParties;
	}

	public double getTotalSales() {
		return TotalSales;
	}

	public void setTotalSales(double totalSales) {
		TotalSales = totalSales;
	}

	public ArrayList<Double> getAgentSum() {
		return agentSum;
	}

	public void setAgentSum(ArrayList<Double> agentSum) {
		this.agentSum = agentSum;
	}

	public ArrayList<Integer> getContactList() {
		return contactList;
	}

	public void setContactList(ArrayList<Integer> contactList) {
		this.contactList = contactList;
	}
}
