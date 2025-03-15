package com.diegodev.buskitrampos.dtos.companys;


import java.time.LocalDateTime;
import java.util.List;

public record CompanyResponseDTO(
    Long id,
    String name,
    String about,
    String cnpj,
    String cover,
    String email,
    String phone,
    String linkedinUrl,
    String instagramUrl,
    String website,
    String city,
    String state,
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    Long userId, // ID do usuário associado à empresa
    List<Long> jobIds // IDs dos jobs associados à empresa
) {} 
