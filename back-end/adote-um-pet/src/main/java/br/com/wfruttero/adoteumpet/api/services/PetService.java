package br.com.wfruttero.adoteumpet.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wfruttero.adoteumpet.api.pet.dtos.PetResponse;
import br.com.wfruttero.adoteumpet.api.pet.mappers.PetMapper;
import br.com.wfruttero.adoteumpet.core.repositories.PetRepository;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PetMapper petMapper;

    public List<PetResponse> findAll() {
        return petRepository.findAll()
                .stream()
                .map(petMapper::toResponse)
                .toList();
    }

}
