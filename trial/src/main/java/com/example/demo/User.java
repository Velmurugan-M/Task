package com.example.demo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private int input1;
	private int input2;
	private char ope;	
	private Date entered_on;	
	private int result;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getInput1() {
		return input1;
	}

	public void setInput1(int input1) {
		this.input1 = input1;
	}

	public int getInput2() {
		return input2;
	}

	public void setInput2(int input2) {
		this.input2 = input2;
	}

	public char getOpe() {
		return ope;
	}

	public void setOpe(char ope) {
		this.ope = ope;
	}

	
	public Date getEntered_on() {
		return entered_on;
	}

	public void setEntered_on(Date date) {
		this.entered_on = date;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
}
