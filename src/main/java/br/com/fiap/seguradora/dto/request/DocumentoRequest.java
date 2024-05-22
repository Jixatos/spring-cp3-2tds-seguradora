package br.com.fiap.seguradora.dto.request;

import br.com.fiap.seguradora.entity.Foto;
import br.com.fiap.seguradora.entity.TipoDocumento;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record DocumentoRequest(
        @NotNull
        String numero,
        TipoDocumento tipo

) {
}
