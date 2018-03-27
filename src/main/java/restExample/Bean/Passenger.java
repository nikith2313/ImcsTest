package restExample.Bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Passenger_Profile")
public class Passenger {
	@Id
	@Column(name = "profile_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int profileId;
	@OneToMany(mappedBy="passenger", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CreditCardDetails> creditCardDetails;
	@Column(name = "first_Name")
	private String firstName;
	@Column(name = "last_Name")
	private String lastName;
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public void setCreditCardDetails(List<CreditCardDetails> creditCardDetails) {
		this.creditCardDetails = creditCardDetails;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setTelePhoneno(long telePhoneno) {
		this.telePhoneno = telePhoneno;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Column(name = "address")
	private String address;
	@Column(name = "password")
	private String password;
	@Column(name = "tel_no")
	private long telePhoneno;
	@Column(name = "email_id")
	private String emailId;
	public Passenger() {

	}
	public int getProfileId() {
		return profileId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getPassword() {
		return password;
	}
	public long getTelePhoneno() {
		return telePhoneno;
	}
	public String getEmailId() {
		return emailId;
	}
	
}
