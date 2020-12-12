package com.assignments.assignment5.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;

@Entity
@Table(name = "CheckingAccount")
public class CheckingAccount extends BankAccount {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ca_id")
    private Integer caid;
	
	@Column(name = "ah_id")
	private Integer ahid;

	public void setCaid(Integer caid) {
		this.caid = caid;
	}
	
	public Integer getCaid() {
		return caid;
	}

	public Integer getAhid() {
		return ahid;
	}

	public void setAhid(Integer ahid) {
		this.ahid = ahid;
	}


	@DecimalMin(value = "0.0", inclusive = false, message = "interest rate must be greater than zero")
	@DecimalMax(value = "1", inclusive = false, message = "interest rate must be less than one")
	double interestRate = 0.0001;

	public CheckingAccount() {
		super();
	}
	
	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}