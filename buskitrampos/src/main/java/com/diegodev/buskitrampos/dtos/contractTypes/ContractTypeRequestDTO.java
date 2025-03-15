package com.diegodev.buskitrampos.dtos.contractTypes;


import com.diegodev.buskitrampos.enums.Contract;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ContractTypeRequestDTO(
    @NotBlank(message = "Nome do tipo de contrato não pode ser vazio")
    @Size(min = 5, max = 10, message = "Nome do tipo de contrato deve ter entre 5 e 10 caracteres")
    Contract name
) {}