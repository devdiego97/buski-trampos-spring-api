package com.diegodev.buskitrampos.dtos.companys;

public record CompanyRequestDto(
  String name,String about,String cover,String cnpj,String state,String  city,
  String phone,String linkedinUrl,String instagramUrl,String website
) {
    
}
