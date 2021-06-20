package com.iagogomes.cursomc.repositories;

import com.iagogomes.cursomc.domain.Categoria;
import com.iagogomes.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	
}
