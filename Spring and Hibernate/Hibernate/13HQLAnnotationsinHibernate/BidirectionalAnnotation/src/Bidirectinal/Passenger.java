package Bidirectinal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pasn")

public class Passenger {

	@Id
	@Column(name="PassengerID")
	private int PassengerID;
	
	@Column(name="SeatNo")
	private int SeatNo;
	
	
	@Column(name="Name")
	private String Name;
	
	@ManyToOne(targetEntity = Train.class, cascade = CascadeType.ALL)
	@JoinColumn(name="TrainNo", referencedColumnName="TrainNo")
	
	private Train parent;
	
	public Train getParent() {
		return parent;
	}


	public void setParent(Train parent) {
		this.parent = parent;
	}
    
	public int getPassengerID() {
		return PassengerID;
	}


	public void setPassengerID(int passengerID) {
		PassengerID = passengerID;
	}


	public int getSeatNo() {
		return SeatNo;
	}


	public void setSeatNo(int seatNo) {
		SeatNo = seatNo;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
	
	
	
}
