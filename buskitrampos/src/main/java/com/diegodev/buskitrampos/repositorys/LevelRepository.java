package com.diegodev.buskitrampos.repositorys;



import org.springframework.data.jpa.repository.JpaRepository;

import com.diegodev.buskitrampos.entities.CompanyEntity;
import com.diegodev.buskitrampos.entities.LevelRequiredEntity;

public interface LevelRepository extends JpaRepository<LevelRequiredEntity,Long> {
    
}