package com.panel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.panel.Model.Panels;

@Repository
public interface PanelRepository  extends JpaRepository<Panels, String>{

}
