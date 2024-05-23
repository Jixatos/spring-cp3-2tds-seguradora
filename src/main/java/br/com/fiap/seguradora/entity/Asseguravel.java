package br.com.fiap.seguradora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Inheritance(strategy = InheritanceType.JOINED)

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TBL_ASSEGURAVEL")
public class Asseguravel {

    @Id
    @SequenceGenerator(name = "SQ_ASSEGURAVEL", sequenceName = "SQ_ASSEGURAVEL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ASSEGURAVEL")
    @Column(name = "ID_ASSEGURAVEL")
    private Long id;

    @Column(name = "VL_ASSEGURAVEL")
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_ASSEGURAVEL")
    private TipoSeguro tipo;
}
