package br.com.wfruttero.adoteumpet;

import br.com.wfruttero.adoteumpet.core.models.Pet;
import br.com.wfruttero.adoteumpet.core.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

    @Autowired
    private PetRepository petRepository;

    public static void main(String[] args) {
        SpringApplication.run(AdoteUmPetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var pet = new Pet();
        pet.setNome("Madruga");
        pet.setHistoria("Chefe de organização criminosa, pego em flagrante");
        pet.setFoto("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThJHrR3q7Vg9Eyhgv7qxuI4wAoYtdiqAH3_A&usqp=CAU");
        petRepository.save(pet);
    }
}
