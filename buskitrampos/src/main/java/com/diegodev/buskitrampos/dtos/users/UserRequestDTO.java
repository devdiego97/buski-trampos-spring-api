package com.diegodev.buskitrampos.dtos.users;


import com.diegodev.buskitrampos.enums.TypeUser;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UserRequestDTO(
    @NotBlank(message = "Nome de usuário não pode ser vazio")
    @Size(min = 4, max = 20, message = "Nome de usuário deve ter entre 4 e 20 caracteres")
    String name,

    @NotBlank(message = "Sobrenome de usuário não pode ser vazio")
    @Size(min = 4, max = 30, message = "Sobrenome de usuário deve ter entre 4 e 30 caracteres")
    String lastname,

    @NotBlank(message = "O e-mail é obrigatório")
    @Email(message = "O e-mail deve ser válido")
    String email,

    @NotBlank(message = "A senha não pode ser vazia")
    @Size(min = 14, max = 30, message = "A senha deve ter entre 14 e 30 caracteres")
    String password,

    @NotBlank(message = "O telefone é obrigatório")
    @Pattern(regexp = "^[0-9]{10,11}$", message = "O telefone deve conter apenas números e ter 10 ou 11 dígitos")
    String phone,

    TypeUser userType,

    Long companyId // ID da empresa associada (opcional)
) {}