package com.panel.Model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
@Table(name="panels")
public class Panels {
	@Id
	private String id;
	
	@Column(name = "status")
	 private String status;
	
	
	
	
	 public Panels(String id, String status) {
		 this.id = id;
		this.status = status;
	}

	  public Panels() {
		  
	  }


	
     public String getId() {
     return id;
 }
 public void setId(String id) {
     this.id = id;
 }

  public String getStatePanel() {
	return status;
}
public void setStatePanel(String state) {
	this.status = state;
}	

	
}
