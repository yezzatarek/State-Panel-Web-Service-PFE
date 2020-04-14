package com.panel.service;

import java.util.List;

import com.panel.Model.Panels;


public interface PanelService {
    List<Panels> getPanelsByState();
	//public void createPanels(List<Panels>  panels);
	public void deleteAllPanels();


}
