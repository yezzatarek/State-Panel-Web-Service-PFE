package com.panel.service;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panel.Model.Panels;
import com.panel.repository.PanelRepository;


@Service
public class PanelServiceImpl implements PanelService {
	@PersistenceContext
    EntityManager entityManager;
	@Autowired
	PanelRepository panel;
	@Override
	public List<Panels> getPanelsByState() {
		Query query = entityManager.createNativeQuery("SELECT p.* FROM Panels as p " +
                "WHERE p.status LIKE '%broken%' ", Panels.class);
        return query.getResultList();
    
	}
	@Override
	public void createPanels(List<Panels> panels) {
           panel.saveAll(panels);
	}
	@Override
	public void deleteAllPanels() {
panel.deleteAll();		
	}
	
	
	public Panels updatePanels(Panels pane) {
      Panels o =this.panel.findById(pane.getId()).orElseThrow(()->new ValidationException("Panel not found"));
            o.setPriority(pane.getPriority());
            o.setDescription(pane.getDescription());
            o.setStatus(pane.getStatus());
     
     return this.panel.save(o); }
	
	

}
