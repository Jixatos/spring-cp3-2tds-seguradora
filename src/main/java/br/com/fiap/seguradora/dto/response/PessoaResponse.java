package br.com.fiap.seguradora.dto.response;

import lombok.Builder;

@Builder
public record PessoaResponse(
        Long id,
        String nome,
        String sobrenome,
        String email
) {
}
