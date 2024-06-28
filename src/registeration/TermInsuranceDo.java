package registeration;

public class TermInsuranceDo extends BasePolicyDo{
	String policyseq;
	double premiumamt;
	double sumassured;
	String agentseq;
	
	public String getAgentseq() {
		return agentseq;
	}

	public void setAgentseq(String agentseq) {
		this.agentseq = agentseq;
	}

	public String toString(){
		return "The policy details are:- " +"\n1.PartySeq " + super.partyseq+ "\n2.PolicySeq " + policyseq + "\n3.Premium Amount " + premiumamt + "\n4.sumassured " + sumassured +
				"\nThe agent seq" + agentseq ;
	}
	
	public TermInsuranceDo(String partyseq,String policyseq,double sumassured,String agentseq) {
		super(partyseq);
		this.policyseq = policyseq;
		this.premiumamt = premiumamt;
		this.sumassured = sumassured;
		this.partyseq=partyseq;
		this.agentseq = agentseq;
	}

	public String getPolicyseq() {
		return policyseq;
	}

	public void setPolicyseq(String policyseq) {
		this.policyseq = policyseq;
	}

	public double getPremiumamt() {
		return premiumamt;
	}

	public void setPremiumamt(double premiumamt) {
		this.premiumamt = premiumamt;
	}

	public double getSumassured() {
		return sumassured;
	}

	public void setSumassured(double sumassured) {
		this.sumassured = sumassured;
	}
}
