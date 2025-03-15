package com.diegodev.buskitrampos.dtos.levels;


import com.diegodev.buskitrampos.enums.Level;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LevelRequiredRequestDTO(
    @NotBlank(message = "Nome do level não pode ser vazio")
    @Size(min = 5, max = 10, message = "Nome do level deve ter entre 5 e 10 caracteres")
    Level name,
    String description
) {}