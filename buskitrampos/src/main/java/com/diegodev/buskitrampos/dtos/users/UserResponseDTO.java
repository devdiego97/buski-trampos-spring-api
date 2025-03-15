package com.diegodev.buskitrampos.dtos.users;

import com.diegodev.buskitrampos.enums.TypeUser;

import java.time.LocalDateTime;

public record UserResponseDTO(
    Long id,
    String name,
    String lastname,
    String email,
    String phone,
    TypeUser userType,
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    Long companyId // ID da empresa associada (opcional)
) {}