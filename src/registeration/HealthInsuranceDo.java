package registeration;

public class HealthInsuranceDo extends BasePolicyDo {
	String policyseq;
	double premiumamt;
	double sumassured;
	double healthcover;
	String agentseq;
	
	public String getAgentseq() {
		return agentseq;
	}

	public void setAgentseq(String agentseq) {
		this.agentseq = agentseq;
	}
	
	public String toString(){
		return "The policy details are:- " + "\n1.PartySeq "+ super.partyseq +  "\n2.PolicySeq " + policyseq + "\n3.Premium Amount " + premiumamt + "\n4.sumassured " + sumassured +"\n5.Health cover " + healthcover;
	}
	
	HealthInsuranceDo(String partyseq,String policyseq,double sumassured,String agentseq){
		super(partyseq);
		this.policyseq = policyseq;
		this.premiumamt = premiumCalculationDo.premiumCalHealthins(sumassured);
		this.sumassured = sumassured;
		this.healthcover = (5/100) * sumassured;
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

	public double getHealthcover() {
		return healthcover;
	}

	public void setHealthcover(double healthcover) {
		this.healthcover = healthcover;
	}
}
