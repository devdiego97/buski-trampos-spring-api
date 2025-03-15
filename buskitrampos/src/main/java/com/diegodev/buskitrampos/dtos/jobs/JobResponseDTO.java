package com.diegodev.buskitrampos.dtos.jobs;



import com.diegodev.buskitrampos.enums.Level;
import com.diegodev.buskitrampos.enums.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.sql.Date;

public record JobResponseDTO(
    Long id,
    String title,
    String about,
    String requirements,
    Level levelRequired,
    Status status,
    String city,
    String state,
    BigDecimal salary,
    String benefits,
    boolean exclusivePCD,
    Date expireDate,
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    Long companyId,
    Long modelOperatingId,
    Long levelRequiredId,
    Long contractTypeId
) {} 
