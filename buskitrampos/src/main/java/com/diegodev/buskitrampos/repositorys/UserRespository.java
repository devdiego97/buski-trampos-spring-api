package com.diegodev.buskitrampos.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegodev.buskitrampos.entities.UserEntity;

public interface UserRespository extends JpaRepository<UserEntity,Long> {
    
}
