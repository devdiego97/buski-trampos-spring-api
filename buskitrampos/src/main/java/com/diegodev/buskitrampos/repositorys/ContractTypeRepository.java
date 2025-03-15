package com.diegodev.buskitrampos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;


import com.diegodev.buskitrampos.entities.ContractTypeEntity;

public interface ContractTypeRepository extends JpaRepository<ContractTypeEntity,Long> {
    
}