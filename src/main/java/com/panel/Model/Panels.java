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
	
	@Column(name = "name")
	 private String name;
	
	@Column(name = "priority")
	 private String priority;
	
	@Column(name = "description")
	 private String description;
	
	
	 public Panels(String id, String status, String name, String priority, String description) {
		 this.id = id;
		this.status = status;
		this.name=name;
		this.priority=priority;
		this.description=description;
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

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPriority() {
	return priority;
}

public void setPriority(String priority) {
	this.priority = priority;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}	

	
}
