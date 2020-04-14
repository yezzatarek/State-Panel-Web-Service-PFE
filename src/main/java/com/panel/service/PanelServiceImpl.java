package com.panel.service;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
		Query query = entityManager.createNativeQuery("SELECT p.Id, p.state FROM Panels as p " +
                "WHERE p.state LIKE '%broken%' ", Panels.class);
        return query.getResultList();
    
	}
	@Override
	public void createPanels( Panels panels) {
           panel.save(panels);
	}

	

}
