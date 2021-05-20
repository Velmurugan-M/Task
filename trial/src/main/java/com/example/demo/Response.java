package com.example.demo;

import java.sql.Time;
import java.util.Date;

public class Response {

	int result;
	
	Date enterd_on;

	public Response(int result, Date enterd_on) {
		super();
		this.result = result;
		this.enterd_on = enterd_on;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public Date getEnterd_on() {
		return enterd_on;
	}

	public void setEnterd_on(Date enterd_on) {
		this.enterd_on = enterd_on;
	}
	
	
	
	
}
