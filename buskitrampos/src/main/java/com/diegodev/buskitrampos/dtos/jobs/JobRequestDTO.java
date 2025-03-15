package com.diegodev.buskitrampos.dtos.jobs;

import com.diegodev.buskitrampos.enums.Level;
import com.diegodev.buskitrampos.enums.Status;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.sql.Date;

public record JobRequestDTO(
    @NotBlank(message = "O campo title não pode ser vazio")
    @Size(min = 10, max = 30, message = "O título deve ter entre 10 e 30 caracteres")
    String title,

    @NotBlank(message = "O campo ABOUT não pode ser vazio")
    @Size(min = 50, max = 500, message = "O campo SOBRE deve ter entre 50 e 500 caracteres")
    String about,

    @NotBlank(message = "O campo REQUIREMENTS não pode ser vazio")
    @Size(min = 50, max = 500, message = "O campo REQUIREMENTS deve ter entre 50 e 500 caracteres")
    String requirements,

    @NotBlank(message = "O campo LEVEL não pode ser vazio")
    Level levelRequired,

    @NotBlank(message = "O campo STATUS não pode ser vazio")
    Status status,

    @Size(min = 2, max = 30, message = "O campo CITY deve ter entre 2 e 30 caracteres")
    String city,

    @Size(min = 2, max = 2, message = "O campo STATE deve ter exatamente 2 caracteres")
    String state,

    BigDecimal salary,

    @NotBlank(message = "O campo BENEFITS não pode ser vazio")
    @Size(min = 50, max = 500, message = "O campo BENEFITS deve ter entre 50 e 500 caracteres")
    String benefits,

    boolean exclusivePCD,

    Date expireDate,

    Long companyId,
    Long modelOperatingId,
    Long levelRequiredId,
    Long contractTypeId
) {}