package com.diegodev.buskitrampos.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "companys")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "nome da empresa é obrigatório")
    @Size(min=4,max=50,message = "nome da empresa deve ter entre 4 e 50 caracteres")
    private String name;

    @NotBlank(message = "campo sobre a  empresa é obrigatório")
    @Size(min=100,max=1500,message = "campo sobre a empresa deve ter entre 4 e 1500 caracteres")
    private String about;

    @CNPJ(message = "CNPJ inválido")
    private String cnpj;

    private String cover;
    @Email(message = "Email deve ser válido")
    private String email;
    
    @NotBlank(message = "campo telefone não pode ser vazio")
    @Pattern(regexp = "\\d{10,11}", message = "Telefone deve conter apenas números e ter entre 10 e 11 dígitos")
    private String phone;

    private String linkedinUrl;

    private String instagramUrl;
    private String website;
    @NotBlank(message = "cidade da empresa é obrigatório")
    @Size(min=4,max=50,message = "cidade da empresa deve ter entre 4 e 50 caracteres")
    private String city;
    @NotBlank(message = "estado da empresa é obrigatório")
    @Size(min = 2, max = 2, message = "estado da empresa deve ter exatamente 2 caracteres")
    @Column(length = 2) // Garante que a coluna seja mapeada como varchar(2)
    private String state;


  @CreatedDate
  @Column(name = "created_at", updatable = false) 
  private LocalDateTime createdAt;

  @LastModifiedDate
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;
    /*
     Relacionamento Obrigatório: A Company não pode existir sem um User associado (optional = false e nullable = false).
      Cardinalidade: Várias empresas podem estar associadas a um único usuário (@ManyToOne).
    */
    @ManyToOne(optional = false) // A empresa não pode existir sem um usuário
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<JobEntity> jobs = new ArrayList<>();

}
