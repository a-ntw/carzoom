package carDate.inv;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="INVID")
	private int invId;
	
	@Column(name="invno", unique=true)
	private String invNo;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="dated")
	private LocalDate dated;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="paiddate")
	private LocalDate paidDate;
	
	@Column(name="custid")
	private int custId;
	
	@Column(name="hireid")
	private int hireId;	
	
	private String desc1;
	private String desc2;
	private String desc3;
	
	@Column(name = "invmapid", nullable = false)
	private int invMapId;
	
	private float rated;
	private float amount;

	@Column(name="paymtdone")
	private boolean paymtDone;
	
	public Invoice() {
		super();
	}

	@Override
	public String toString() {
		return "Invoice [invId=" + invId + ", invNo=" + invNo + ", dated=" + dated 
				+ ", custId=" + custId + ", hireId=" + hireId + ", rated=" + rated 
				+ ", amount=" + amount + ", paidDate=" + paidDate + "]";
	}

	public int getInvId() {
		return invId;
	}

	public void setInvId(int invId) {
		this.invId = invId;
	}

	public String getInvNo() {
		return invNo;
	}

	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}

	public LocalDate getDated() {
		return dated;
	}

	public void setDated(LocalDate dated) {
		this.dated = dated;
	}

	public LocalDate getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getHireId() {
		return hireId;
	}

	public void setHireId(int hireId) {
		this.hireId = hireId;
	}

	public String getDesc1() {
		return desc1;
	}

	public void setDesc1(String desc1) {
		this.desc1 = desc1;
	}

	public String getDesc2() {
		return desc2;
	}

	public void setDesc2(String desc2) {
		this.desc2 = desc2;
	}

	public String getDesc3() {
		return desc3;
	}

	public void setDesc3(String desc3) {
		this.desc3 = desc3;
	}

	public int getInvMapId() {
		return invMapId;
	}

	public void setInvMapId(int invMapId) {
		this.invMapId = invMapId;
	}

	public float getRated() {
		return rated;
	}

	public void setRated(float rated) {
		this.rated = rated;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public boolean isPaymtDone() {
		return paymtDone;
	}

	public void setPaymtDone(boolean paymtDone) {
		this.paymtDone = paymtDone;
	}
}