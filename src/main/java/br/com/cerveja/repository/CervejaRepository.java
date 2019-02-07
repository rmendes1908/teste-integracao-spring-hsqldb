package br.com.cerveja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cerveja.modelo.Cerveja;

public interface CervejaRepository extends JpaRepository<Cerveja, Long>{

}
