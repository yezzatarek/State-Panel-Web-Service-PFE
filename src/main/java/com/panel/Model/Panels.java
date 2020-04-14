package com.panel.Model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="panels")
public class Panels {
	@Id
	private String id;
	
	 @Column(name = "state")
	 private String state;
	
	public Panels() {
		super();
	}
	
	
	
	 public Panels(String id, String state) {
		 this.id = id;
		this.state = state;
	}



	
     public String getId() {
     return id;
 }
 public void setId(String id) {
     this.id = id;
 }


   public String getStatePanel() {
	return state;
}

public void setStatePanel(String state) {
	this.state = state;
}	

	
}
