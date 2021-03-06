package br.com.wfruttero.adoteumpet.api.adocao.mappers;

import br.com.wfruttero.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.wfruttero.adoteumpet.api.adocao.dtos.AdocaoResponse;
import br.com.wfruttero.adoteumpet.api.pet.mappers.PetMapper;
import br.com.wfruttero.adoteumpet.core.models.Adocao;
import br.com.wfruttero.adoteumpet.core.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdocaoMapper {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetMapper petMapper;

    public Adocao toModel(AdocaoRequest adocaoRequest) {
        // var adocao = new Adocao();
        // adocao.setEmail(adocaoRequest.getEmail());
        // adocao.setValor(adocaoRequest.getValor());
        // adocao.setPet(petRepository.findByIdOrElseThrow(adocaoRequest.getPetId()));
        // return adocao;
        return Adocao.builder()
                .email(adocaoRequest.getEmail())
                .valor(adocaoRequest.getValor())
                .pet(petRepository.findByIdOrElseThrow(adocaoRequest.getPetId()))
                .build();
    }

    public AdocaoResponse toResponse(Adocao adocao) {
        // var adocaoResponse = new AdocaoResponse();
        // adocaoResponse.setId(adocao.getId());
        // adocaoResponse.setEmail(adocao.getEmail());
        // adocaoResponse.setValor(adocao.getValor());
        // adocaoResponse.setPet(petMapper.toResponse(adocao.getPet()));
        // return adocaoResponse;
        return AdocaoResponse.builder()
                .id(adocao.getId())
                .email(adocao.getEmail())
                .valor(adocao.getValor())
                .pet(petMapper.toResponse(adocao.getPet()))
                .build();
    }
}
