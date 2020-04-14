package com.panel.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panel.Model.Panels;
import com.panel.service.PanelService;

@RestController
@RequestMapping("/panels")
public class PanelController {
	@Autowired
	PanelService serv;
	
	
	@GetMapping("/state")
    public List<Panels> getFiltered() {
        return serv.getPanelsByState();
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
}
