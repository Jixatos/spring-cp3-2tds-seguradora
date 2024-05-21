package br.com.fiap.seguradora.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_SEGURO")
public class Seguro {

    @Id
    @SequenceGenerator(name = "SQ_SEGURO", sequenceName = "SQ_SEGURO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SEGURO")
    @Column(name = "ID_SEGURO")
    private Long id;

    private Double premio;

    @Column(name = "VL_SEGURO")
    private Double valor;

    private LocalDate inico;

    private LocalDate fim;

    private Pessoa contratante;

    private Asseguravel objeto;
}
