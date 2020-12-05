package ps;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	
	@Id
	@Column(name="aid")
	private int addressId;
	
	@Column(name="acity",length=50)
	private String city;
	
	@Column(name="astate",length=50)
	private String state;
	
	@OneToOne(targetEntity=Student.class,cascade=CascadeType.ALL)
	@JoinColumn(name="St_id",referencedColumnName="sid")
	private Student s;	

	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
