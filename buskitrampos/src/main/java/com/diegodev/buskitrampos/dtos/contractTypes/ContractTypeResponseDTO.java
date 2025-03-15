package com.diegodev.buskitrampos.dtos.contractTypes;



import com.diegodev.buskitrampos.enums.Contract;

public record ContractTypeResponseDTO(
    Long id,
    Contract name
) {}