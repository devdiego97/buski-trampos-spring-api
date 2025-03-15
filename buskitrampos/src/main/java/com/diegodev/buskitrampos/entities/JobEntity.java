package com.diegodev.buskitrampos.entities;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.diegodev.buskitrampos.enums.Level;
import com.diegodev.buskitrampos.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="jobs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class JobEntity {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
  @NotBlank(message = "o campo title não pode ser vazio")
  @Size(min=10,max=30,message = "o titulo dee ter entre 10 e 3 caracteres")
  private String title;

  @NotBlank(message = "o campo ABOUT não pode ser vazio")
  @Size(min=50,max=500,message = "o campo SOBRE deve ter entre 50 e 500 caracteres")
  private String about;

  @NotBlank(message = "o campo REQUIREMENTS não pode ser vazio")
  @Size(min=50,max=500,message = "o campo REQUIREMENTS deve ter entre 50 e 500 caracteres")
  private String requirements;

  @NotBlank(message = "o campo LEVEL não pode ser vazio")
  @Enumerated(EnumType.STRING)
  private Level levelRequired;
 
  @NotBlank(message = "o campo STATUS não pode ser vazio")
  @Enumerated(EnumType.STRING)
  private Status status;

  @Size(min=2,max=30,message = "o campo CITY deve ter entre 2  e 30 caracteres")
  private String city;

  @Size(min=2,max=2,message = "o campo STATE deve ter entre 2 caracteres")
  private String state;
 
  @Column(precision = 19, scale = 2)
  private BigDecimal salary;

  @NotBlank(message = "o campo BENEFITS não pode ser vazio")
  @Size(min=50,max=500,message = "o campo BENEFITS deve ter entre 50 e 500 caracteres")
  private String benefits;
   

  @Column(columnDefinition = "boolean default false") // Valor padrão no banco de dados
  private boolean  exclusivePCD ;
    
  @Temporal(TemporalType.DATE) 
  private Date  expireDate;

    
  @CreatedDate
  @Column(name = "created_at", updatable = false) 
  private LocalDateTime createdAt;

  @LastModifiedDate
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;



    @ManyToOne(optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @ManyToOne(optional = false)
    @JoinColumn(name = "model_operating_id", nullable = false)
    private ModelOperating modelOperating;

    @ManyToOne(optional = false)
    @JoinColumn(name = "level_required_id", nullable = false)
    private Level level;
 
    /*
  

  companyid:number,
    categoryid:number,
    jobLevelId:number,
    jobContractTypeId:number,
    modelOperatingId:number,
  */
}
