package br.com.fiap.seguradora.dto.response;

import lombok.Builder;

@Builder
public record SeguroResponse(
        Long id,
        Double premio,
        Double valor
) {
}
