package br.com.wfruttero.adoteumpet.api.pet.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PetResponse {

    private Long id;
    private String nome;
    private String historia;
    private String foto;    
}
