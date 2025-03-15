package com.diegodev.buskitrampos.entities;

import com.diegodev.buskitrampos.enums.Contract;
import com.diegodev.buskitrampos.enums.Level;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="contract_types")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContractTypeEntity {
     @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;

    @NotBlank(message = "nome do tipo de contrato não pode ser vazio")
    @Size(min=5,max = 10,message ="nome do tipo de contrato  deve ser entre 5 e 10 caracteres")
    @Enumerated(EnumType.STRING)
    private Contract name;
    
}
