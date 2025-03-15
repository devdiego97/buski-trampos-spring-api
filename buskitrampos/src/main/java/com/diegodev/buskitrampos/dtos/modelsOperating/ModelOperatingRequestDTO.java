package com.diegodev.buskitrampos.dtos.modelsOperating;


import com.diegodev.buskitrampos.enums.ModeOfAction;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ModelOperatingRequestDTO(
    @NotBlank(message = "Nome do modelo de atuação não pode ser vazio")
    @Size(min = 5, max = 10, message = "Nome do modo de atuação deve ter entre 5 e 10 caracteres")
    ModeOfAction name
) {}