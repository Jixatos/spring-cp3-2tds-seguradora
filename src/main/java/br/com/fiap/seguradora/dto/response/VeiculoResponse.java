package br.com.fiap.seguradora.dto.response;

import lombok.Builder;

@Builder
public record VeiculoResponse(
    String placa,
    String modelo,
    String cor,
    String marca,
    String chassis
) {
}
