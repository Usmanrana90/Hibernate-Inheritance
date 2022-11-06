package cloudxweb;

import javax.persistence.Entity;
import javax.persistence.InheritanceType;
import javax.persistence.*;

@Entity
@Table(name="payment")
@Inheritance(strategy=InheritanceType.JOINED)
public class Payment {
	@Id
	@Column(name="TX_ID")
	private String tx_id;
	@Column(name="PAY_DATE")
	private String pay_date;
	@Column(name="PAY_AMT")
	private int pay_amt;
	public String getTx_id() {
		return tx_id;
	}
	public void setTx_id(String tx_id) {
		this.tx_id = tx_id;
	}
	public String getPay_date() {
		return pay_date;
	}
	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}
	public int getPay_amt() {
		return pay_amt;
	}
	public void setPay_amt(int pay_amt) {
		this.pay_amt = pay_amt;
	}
	
	

}
