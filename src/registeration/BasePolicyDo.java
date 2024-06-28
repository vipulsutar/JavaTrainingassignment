package registeration;

public class BasePolicyDo implements termsAndCondition {
	 static String partyseq;
	 
	 BasePolicyDo(String partyseq2){
		 this.partyseq = partyseq;
	 }

	public static String getPartyseq() {
		return partyseq;
	}

	public static void setPartyseq(String partyseq) {
		BasePolicyDo.partyseq = partyseq;
	}

	public void disclaimerMessage(){
		System.out.println("Term Insurance covers natural and accidental death up to $500,000, with a $50 monthly premium, 30-day grace period, exclusions for suicide within the first 2 years, and a 15-day claim resolution period");
	}
}
