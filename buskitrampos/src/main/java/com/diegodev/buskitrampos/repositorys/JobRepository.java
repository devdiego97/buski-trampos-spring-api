package com.diegodev.buskitrampos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegodev.buskitrampos.entities.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity,Long> {
    
}
