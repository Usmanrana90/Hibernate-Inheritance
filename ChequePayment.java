package cloudxweb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cheque_payment")
@PrimaryKeyJoinColumn(name="TX_ID")
public class ChequePayment extends Payment{
	@Column(name="CHEQUE_NO")
	private int cheque_no;
	@Column(name="EXPR_DATE")
	private String exp_date;
	
	public int getCheque_no() {
		return cheque_no;
	}
	public void setCheque_no(int cheque_no) {
		this.cheque_no = cheque_no;
	}
	public String getExp_date() {
		return exp_date;
	}
	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	

}
