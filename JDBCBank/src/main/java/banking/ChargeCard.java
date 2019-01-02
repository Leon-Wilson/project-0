package banking;

public class ChargeCard {
	private Integer cardID;
	private Integer cardNumber;
	private Integer cardPin;
	private Double creditLimit;
	private Account cardAccount;
	
//---CONSTRUCTORS---//
	
	//--NEW CARD--//
	
	/***
	 * @author Leon Wilson
	 */
	public ChargeCard(Integer cardID, Integer pin, Account account) {
		this.setCardID(cardID);
		this.setCardNumber(111222333);//Assign a card number
		this.setCardPin(pin);
		this.setCreditLimit(500.00D);
		this.setCardAccount(account);
	}
	
	//--EXISTING CARD--//
	
	/***
	 * @author Leon Wilson
	 */
	public ChargeCard(Integer cardID, Integer cardNumber, Integer pin, Double limit, Account account) {
		this.setCardID(cardID);
		this.setCardNumber(cardNumber);
		this.setCardPin(pin);
		this.setCreditLimit(limit);
		this.setCardAccount(account);
	}

//---FUNCTIONS---//
	
	/***
	 * @author Leon Wilson
	 */
	public void debitPurchase(Integer pin, Transaction trans) {
		
	}
	
	/***
	 * @author Leon Wilson
	 */
	public void creditPurchase(Transaction trans) {
		
	}

	//--GETTERS/SETTERS--//
	
	public Integer getCardID() {
		return cardID;
	}

	public void setCardID(Integer cardID) {
		this.cardID = cardID;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Integer getCardPin() {
		return cardPin;
	}

	public void setCardPin(Integer cardPin) {
		this.cardPin = cardPin;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Account getCardAccount() {
		return cardAccount;
	}

	public void setCardAccount(Account cardAccount) {
		this.cardAccount = cardAccount;
	}
}

