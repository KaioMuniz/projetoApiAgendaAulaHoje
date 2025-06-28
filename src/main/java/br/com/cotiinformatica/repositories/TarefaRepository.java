package br.com.cotiinformatica.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.domain.entities.Tarefa;

@Repository
public interface TarefaRepository extends MongoRepository<Tarefa, UUID> {


	List<Tarefa> findByUsuarioId(UUID usuarioId);
	
	List<Tarefa> findByIdAndDataHoraBetween(UUID id, java.time.LocalDateTime dataHoraInicio,
			java.time.LocalDateTime dataHoraFim);
	
	
	Optional<Tarefa> findByIdAndUsuarioId(UUID	 id, UUID usuarioId);

}
