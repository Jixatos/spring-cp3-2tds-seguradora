package br.com.fiap.seguradora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Year;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder()

@Entity
@Table(name = "TBL_VEICULO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_VEICULO_CHASSIS", columnNames = "CHASSIS")
})
public class Veiculo extends Asseguravel {

    private String placa;

    private String modelo;

    private String cor;

    private String marca;

    private String chassis;

    @Column(name = "DT_ANO")
    private Year ano;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_VEICULO", nullable = false)
    private TipoSeguro tipo;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "TBl_VEICULO_FOTO",
            joinColumns = {
                    @JoinColumn(
                            name = "VEICULO",
                            referencedColumnName = "ID_ASSEGURAVEL",
                            foreignKey = @ForeignKey(
                                    name = "FK_VEICULO_FOTO"
                            )
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "FOTO",
                            referencedColumnName = "ID_FOTO",
                            foreignKey = @ForeignKey(
                                    name = "FK_FOTO_VEICULO"
                            )
                    )
            }
    )
    private Set<Foto> fotos = new LinkedHashSet<>();
}
