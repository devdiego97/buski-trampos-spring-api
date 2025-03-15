package com.diegodev.buskitrampos.dtos.companys;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CNPJ;

public record CompanyRequestDTO(
    @NotBlank(message = "Nome da empresa é obrigatório")
    @Size(min = 4, max = 50, message = "Nome da empresa deve ter entre 4 e 50 caracteres")
    String name,

    @NotBlank(message = "Campo sobre a empresa é obrigatório")
    @Size(min = 100, max = 1500, message = "Campo sobre a empresa deve ter entre 100 e 1500 caracteres")
    String about,

    @CNPJ(message = "CNPJ inválido")
    String cnpj,

    String cover,

    @Email(message = "Email deve ser válido")
    String email,

    @NotBlank(message = "Campo telefone não pode ser vazio")
    @Pattern(regexp = "\\d{10,11}", message = "Telefone deve conter apenas números e ter entre 10 e 11 dígitos")
    String phone,

    String linkedinUrl,

    String instagramUrl,

    String website,

    @NotBlank(message = "Cidade da empresa é obrigatório")
    @Size(min = 4, max = 50, message = "Cidade da empresa deve ter entre 4 e 50 caracteres")
    String city,

    @NotBlank(message = "Estado da empresa é obrigatório")
    @Size(min = 2, max = 2, message = "Estado da empresa deve ter exatamente 2 caracteres")
    String state,

    Long userId // ID do usuário associado à empresa
) {}