package registeration;

import java.util.ArrayList;
import java.util.Date;


public class PartyDo {
	String partyTypeCd;
	String partySeq;
	String title;
	String firstName;
	String lastName;
	int age;
	Date dob;
	String genderCd;
	ArrayList<PartyAddressDo>addArr= new ArrayList<PartyAddressDo>();
	ArrayList<PartyContactDo>ContArr = new ArrayList<PartyContactDo>();
	public String getPartyTypeCd() {
		return partyTypeCd;
	}
	public void setPartyTypeCd(String partyTypeCd) {
		this.partyTypeCd = partyTypeCd;
	}
	public String getPartySeq() {
		return partySeq;
	}
	public void setPartySeq(String partySeq) {
		this.partySeq = partySeq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGenderCd() {
		return genderCd;
	}
	public void setGenderCd(String genderCd) {
		this.genderCd = genderCd;
	}
	public ArrayList<PartyAddressDo> getAddArr() {
		return addArr;
	}
	public void setAddArr(ArrayList<PartyAddressDo> addArr) {
		this.addArr = addArr;
	}
	public ArrayList<PartyContactDo> getContArr() {
		return ContArr;
	}
	public void setContArr(ArrayList<PartyContactDo> contArr) {
		ContArr = contArr;
	}	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String toString(){
		return "PartyTypeCd:-" + partyTypeCd + 
				"\nPartysequence:-" + partySeq +
				"\nTitle:-" + title + 
				"\nFirstname:-" + firstName +
				"\nage:-"+ age +
				"\ngender:-" + genderCd +
				"\naddress details:-" + addArr +
				"\nContact Details:-" + ContArr;
		
	}	
}
