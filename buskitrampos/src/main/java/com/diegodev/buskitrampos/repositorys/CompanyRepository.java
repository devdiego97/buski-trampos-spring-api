package com.diegodev.buskitrampos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegodev.buskitrampos.entities.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity,Long> {
    
}
