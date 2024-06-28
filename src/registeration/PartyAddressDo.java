package registeration;

public class PartyAddressDo {
	String partyAddressSeq;
	String partySeq;
	String adressType;
	String countryCd;
	String stateCd;
	String addressdetails;
	String pincode;
	String primaryAddress;
	
	public String toString(){
		return "\nparyAddressSeq:- " + partyAddressSeq + "\npartySeq:- "+ partySeq + "\nadressType:- "+adressType +"\ncountry:- " + countryCd+ "\nstatecd:- "+ stateCd + 
	"\naddressdetails " + addressdetails +"\nPinCode "  + pincode + "\nprimaryAddress "+ primaryAddress;
	}
	
	public String getPartyAddressSeq() {
		return partyAddressSeq;
	}
	public void setPartyAddressSeq(String partyAddressSeq) {
		this.partyAddressSeq = partyAddressSeq;
	}
	public String getPartySeq() {
		return partySeq;
	}
	public void setPartySeq(String partySeq) {
		this.partySeq = partySeq;
	}
	public String getAdressType() {
		return adressType;
	}
	public void setAdressType(String adressType) {
		this.adressType = adressType;
	}
	public String getCountryCd() {
		return countryCd;
	}
	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}
	public String getStateCd() {
		return stateCd;
	}
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}
	public String getAddressdetails() {
		return addressdetails;
	}
	public void setAddressdetails(String addressdetails) {
		this.addressdetails = addressdetails;
	}
	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPrimaryAddress() {
		return primaryAddress;
	}
	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
}
