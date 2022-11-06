package cloudxweb;

import javax.persistence.*;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Table(name="card_payment")
@PrimaryKeyJoinColumn(name="TX_ID")

public class CardPayment extends Payment{
	@Column(name="CARD_NO")
	private int card_No;
	@Column(name="EXPR_DATE")
	private String exp_date;
	
	public int getCard_No() {
		return card_No;
	}
	public void setCard_No(int card_No) {
		this.card_No = card_No;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	
	

}
