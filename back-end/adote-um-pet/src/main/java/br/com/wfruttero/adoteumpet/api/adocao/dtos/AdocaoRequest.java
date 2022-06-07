package br.com.wfruttero.adoteumpet.api.adocao.dtos;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
public class AdocaoRequest {

    private String email;
    private BigDecimal valor;
    private Long petId;
}
