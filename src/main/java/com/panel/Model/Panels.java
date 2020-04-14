package com.panel.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="panels")
public class Panels {
	
	private String id;
	//private String StatePanel;
	
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

	
}
