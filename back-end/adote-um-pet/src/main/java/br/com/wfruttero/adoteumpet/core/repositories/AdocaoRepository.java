package br.com.wfruttero.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wfruttero.adoteumpet.core.models.Adocao;

public interface AdocaoRepository extends JpaRepository<Adocao, Long>{
    
}
