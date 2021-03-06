package banking;

import java.time.LocalDateTime;

public class Transaction {
	final Integer transactionID;
	final String recipient;
	final Double amount;
	final TransactionType type;
	final Integer accountID;
	final LocalDateTime timestamp;
	
//---CONSTRUCTORS---//
	
	/***
	 * @author Leon Wilson
	 */
	public Transaction(Integer transactionID, String recipient, Double amount, TransactionType type, Integer accountID, LocalDateTime timestamp) {
		this.transactionID = transactionID;
		this.recipient = recipient;
		this.amount = amount;
		this.type = type;
		this.accountID = accountID;
		this.timestamp = timestamp;
	}
	
//---FUNCTIONS---//
	
	/***
	 * @author Leon Wilson
	 */
	public void approveTransaction(Account account) {
		if(type == TransactionType.debit) {
			
		}
	}
	
	//---GETTERS/SETTERS---//
}
