package br.com.fiap.seguradora.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_IMOVEL", uniqueConstraints = {
        @UniqueConstraint(name = "UK_IMOVEL_MATRICULA", columnNames = "MATRICULA")
})
public class Imovel extends Asseguravel {

    private String descricao;

    @Column(name = "METROS_QUADRADOS")
    private Float metrosQuadrados;

    private Integer quartos;

    private Integer banheiros;

    @Column(name = "VAGAS_GARAGEM")
    private Integer vagasGaragem;

    private String matricula;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_IMOVEL")
    private TipoSeguro tipo;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "TBl_IMOVEL_FOTO",
            joinColumns = {
                    @JoinColumn(
                            name = "IMOVEL",
                            referencedColumnName = "ID_ASSEGURAVEL",
                            foreignKey = @ForeignKey(
                                    name = "FK_IMOVEL_FOTO"
                            )
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "FOTO",
                            referencedColumnName = "ID_FOTO",
                            foreignKey = @ForeignKey(
                                    name = "FK_FOTO_IMOVEL"
                            )
                    )
            }
    )
    private Set<Foto> fotos = new LinkedHashSet<>();

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "ENDERECO",
            referencedColumnName = "ID_ENDERECO",
            foreignKey = @ForeignKey(
                    name = "FK_IMOVEL_DOCUMENTO"
            )
    )
    private Endereco endereco;
}
