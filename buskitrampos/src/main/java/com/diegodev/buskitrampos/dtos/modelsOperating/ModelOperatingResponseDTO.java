package com.diegodev.buskitrampos.dtos.modelsOperating;



import com.diegodev.buskitrampos.enums.ModeOfAction;

public record ModelOperatingResponseDTO(
    Long id,
    ModeOfAction name
) {}
