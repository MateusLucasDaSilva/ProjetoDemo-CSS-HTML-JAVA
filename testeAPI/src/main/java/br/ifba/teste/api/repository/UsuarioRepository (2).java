package br.ifba.teste.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifba.teste.api.model.UsuarioModel;

@Repository
public interface UsuarioRepository 
	extends JpaRepository<UsuarioModel, Long>
{

}
