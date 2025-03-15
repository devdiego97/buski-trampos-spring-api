package com.diegodev.buskitrampos.dtos.levels;



import com.diegodev.buskitrampos.enums.Level;

public record LevelRequiredResponseDTO(
    Long id,
    Level name,
    String description
) {}