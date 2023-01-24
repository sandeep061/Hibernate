package com.nt.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sandeep3 {
  
	@Id
	private Integer aid;
	private String aname;
	private String color;
	
	//generate Setters and getters
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
