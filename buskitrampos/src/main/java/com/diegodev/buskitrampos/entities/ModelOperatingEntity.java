package com.diegodev.buskitrampos.entities;

import com.diegodev.buskitrampos.enums.ModeOfAction;

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
@Table(name="models_operating")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModelOperatingEntity {
    

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;

    @NotBlank(message = "nome do modelo de atuação não pode ser vazio")
    @Size(min=5,max = 10,message ="nome do modo atuaão deve ser entre 5 e 10 caracteres")
    @Enumerated(EnumType.STRING)
    private ModeOfAction name;
    
}
