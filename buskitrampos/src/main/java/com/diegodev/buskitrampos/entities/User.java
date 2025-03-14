package com.diegodev.buskitrampos.entities;

import com.diegodev.buskitrampos.enums.TypeUser;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @NotBlank(message = "nome de usuário não pode ser vazio")
   @Size(min=4,max=20,message = "nome de usuário deve ter entre 4 e 20 caracteres")
  private String name;
  
  @NotBlank(message = "sobrenome  de usuário não pode ser vazio")
  @Size(min=4,max=30,message = "nome de usuário deve ter entre 4 e 30 caracteres")
  private String lastname;
 
  @NotBlank(message = "O e-mail é obrigatório")
  @Email(message = "O e-mail deve ser válido")
  private String email;
  
  @NotBlank(message = "a senha não pode ser vazia")
  @Size(min=14,max=30,message = "a senha  deve ter entre 14 e 30 caracteres")
  private String password;
  
  @NotBlank(message = "O telefone é obrigatório")
  @Pattern(regexp = "^[0-9]{10,11}$", message = "O telefone deve conter apenas números e ter 10 ou 11 dígitos")
  private String phone;

  @Enumerated(EnumType.STRING)
  private TypeUser userType;


}
