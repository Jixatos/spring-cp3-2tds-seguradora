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
@Table(name = "TBL_DOCUMENTO")
public class Documento {

    @Id
    @SequenceGenerator(name = "SQ_DOCUMENTO", sequenceName = "SQ_DOCUMENTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DOCUMENTO")
    @Column(name = "ID_DOCUMENTO")
    private Long id;

    @Column(name = "NM_DOCUMENTO")
    private String numero;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_DOCUMENTO")
    private TipoDocumento tipo;


    private Set<Foto> fotos = new LinkedHashSet<>();
}
