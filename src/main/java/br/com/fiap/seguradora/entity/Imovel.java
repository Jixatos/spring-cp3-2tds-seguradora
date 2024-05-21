package br.com.fiap.seguradora.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "TBL_IMOVEL")
public class Imovel extends Asseguravel{

    private String descricao;

    @Column(name = "METRO_QUADRADOS")
    private Float metroQuadrados;

    private Integer quartos;

    private Integer banheiros;

    @Column(name = "VAGAS_GARAGEM")
    private Integer vagasGaragem;

    private String matricula;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_IMOVEL")
    private TipoSeguro tipo;


    private Set<Foto> fotos = new LinkedHashSet<>();
}
