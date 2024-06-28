package registeration;

public class SingletonSequenceGenerator {
	int partyseq ;
	int partyAddressseq;	
	int policyseq;
	int contactseq;
	private static SingletonSequenceGenerator sequencedata;
	
	public SingletonSequenceGenerator() {
		this.partyseq = 1;
		this.partyAddressseq = 1;
		this.policyseq = 1;
		this.contactseq = 1;
	}
	
	public static SingletonSequenceGenerator getInstance(){
		if(sequencedata == null){
			sequencedata = new SingletonSequenceGenerator();
			return sequencedata;
		}
		else {
			return sequencedata;
		}
	}
}
