package com.panel.controller;


import java.util.List;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.panel.Model.Panels;
import com.panel.service.PanelService;


@RestController
@RequestMapping("/panels")
public class PanelController {
	@Autowired
	PanelService serv;


	
	@GetMapping("/state")
    public JSONObject getFiltered() {
		JSONObject myobj = new JSONObject(); 
		myobj.put("Panels", serv.getPanelsByState());
		return myobj;

	}
	
	
	
	@PostMapping(value= "/create")
	public String create(@RequestBody List<Panels> panels) {
		serv.createPanels(panels);
		return "Panel records created.";
	}
	
	@DeleteMapping(value= "/deleteall")
	public String deleteAll() {
		serv.deleteAllPanels();
		return "All panels records deleted.";
	}
	
	
 @CrossOrigin(origins = "*")
 @PutMapping
 public Panels edit(@RequestBody Panels pa) {
      return serv.updatePanels(pa);
  }

		
	

}
