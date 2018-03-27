package restExample.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class CreditCardDetails {

	@Id
	@Column(name = "creditCard_id_pk")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int creditCardId;
	@ManyToOne
	@JoinColumn(name = "profile_id")
	private Passenger passenger;
	@Column(name="card_Number")
	private long cardNumber;
	@Column(name="card_Type")	
	private String cardType;
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getExpirationMonth() {
		return expirationMonth;
	}
	public void setExpirationMonth(String expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	public String getExpirationYear() {
		return expirationYear;
	}
	public void setExpirationYear(String expirationYear) {
		this.expirationYear = expirationYear;
	}
	@Column(name="expiration_Month")
	private String expirationMonth;
	@Column(name="expiration_Year")
	private String expirationYear;

}
