package br.com.fiap.seguradora.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_VEICULO")
public class Veiculo extends Asseguravel{

    @Id
    private String placa;

    private String modelo;

    private String cor;

    private String marca;

    private String chassis;

    @Column(name = "DT_YEAR")
    private Year ano;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_VEICULO", nullable = false)
    private TipoSeguro tipo;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "TBL_"
    )
    private Set<Foto> fotos = new LinkedHashSet<>();
}
