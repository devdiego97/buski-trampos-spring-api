package com.diegodev.buskitrampos.dtos.companys;

import java.time.LocalDateTime;
import java.util.List;

import com.diegodev.buskitrampos.entities.JobEntity;
import com.diegodev.buskitrampos.entities.UserEntity;

public record CompanyResponseDto(
    Long id,String name,String about,String cover,String cnpj,String state,String  city,
  String phone,String linkedinUrl,String instagramUrl,String website,
  LocalDateTime createdAt,LocalDateTime updatedAt,UserEntity user,List<JobEntity> jobs
) {
    
}
