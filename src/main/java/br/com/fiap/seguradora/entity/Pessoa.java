package br.com.fiap.seguradora.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_PESSOA")
public class Pessoa {

    @Id
    @SequenceGenerator(name = "SQ_PESSOA", sequenceName = "SQ_PESSOA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PESSOA")
    @Column(name = "ID_PESSOA")
    private Long id;

    @Column(name = "NM_PESSOA")
    private String nome;

    private String sobrenome;

    private String email;

    @Column(name = "DT_NASCIMENTO")
    private LocalDate nascimento;


    private Set<Endereco> enderecos = new LinkedHashSet<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_PESSOA")
    private TipoPessoa tipo;

    private Documento documento;


    private Set<Foto> fotos = new LinkedHashSet<>();
}
