package br.com.wfruttero.adoteumpet.api.pet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wfruttero.adoteumpet.api.pet.dtos.PetResponse;
import br.com.wfruttero.adoteumpet.api.services.PetService;

@RestController
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/api/pets")
    public List<PetResponse> findAll() {

        return petService.findAll();
    }
}
