package registeration;

public class PartyContactDo {
	String partyContactseq;
	String contactType;
	String contactNum;
	
	public String toString()
	{
		return "\nPartyContactSeq:- "
				+ partyContactseq + "\nContact Type:- " + 
				contactType + "\nContact Number:- " +
				contactNum;
	} 
	
	
	public String getPartyContactseq() {
		return partyContactseq;
	}

	public void setPartyContactseq(String partyContactseq) {
		this.partyContactseq = partyContactseq;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
}

