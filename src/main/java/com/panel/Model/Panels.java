package com.panel.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="panels")
public class Panels {
	
	private String id;
	
	private String statepanel;
	
	public Panels() {
		super();
	}
	
	 @Id
     public String getId() {
     return id;
 }
 public void setId(String id) {
     this.id = id;
 }

 
 @Column(name = "statepanel")
public String getStatePanel() {
	return statepanel;
}

public void setStatePanel(String statepanel) {
	this.statepanel = statepanel;
}	

	
}
