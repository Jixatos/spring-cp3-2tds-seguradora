package br.com.fiap.seguradora.dto.response;

import br.com.fiap.seguradora.entity.Asseguravel;
import lombok.Builder;

@Builder
public record ImovelResponse(
        String descricao,
        Float metrosQuadrados,
        Integer quartos,
        Integer vagasGaragem,
        String matricula
) {
}
