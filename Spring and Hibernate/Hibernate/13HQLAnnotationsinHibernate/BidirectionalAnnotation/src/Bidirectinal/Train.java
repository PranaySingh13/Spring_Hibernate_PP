package Bidirectinal;

import java.lang.annotation.Target;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Train")

public class Train {
	
	
	@Id
	@Column(name="TrainNo")
	private int TrainNo;
	
	
	@Column(name="TrainName")
	private String TrainName;
	
	
	@OneToMany(targetEntity = Passenger.class, cascade = CascadeType.ALL)
	@JoinColumn(name="TrainNo", referencedColumnName = "TrainNo")
	
	private Set pas;


	public int getTrainNo() {
		return TrainNo;
	}


	public void setTrainNo(int trainNo) {
		TrainNo = trainNo;
	}


	public String getTrainName() {
		return TrainName;
	}


	public void setTrainName(String trainName) {
		TrainName = trainName;
	}


	public Set getPas() {
		return pas;
	}


	public void setPas(Set pas) {
		this.pas = pas;
	}


	
	

}
