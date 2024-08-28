package com.aulario.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.aulario.entities.PKs.EstudianteHacerDescanso_PK;
import com.aulario.repositories.EstudianteHacerDescansoRepository;

public class EstudianteHacerDescansoService implements EstudianteHacerDescansoRepository{

	@Autowired
	private EstudianteHacerDescansoRepository ehdr;
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<EstudianteHacerDescansoRepository> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<EstudianteHacerDescanso_PK> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EstudianteHacerDescansoRepository getOne(EstudianteHacerDescanso_PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstudianteHacerDescansoRepository getById(EstudianteHacerDescanso_PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstudianteHacerDescansoRepository getReferenceById(EstudianteHacerDescanso_PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstudianteHacerDescansoRepository> findAll() {
		// TODO Auto-generated method stub
		return ehdr.findAll();
	}

	@Override
	public List<EstudianteHacerDescansoRepository> findAllById(Iterable<EstudianteHacerDescanso_PK> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository> S save(S entity) {
		// TODO Auto-generated method stub
		return ehdr.save(entity);
	}

	@Override
	public Optional<EstudianteHacerDescansoRepository> findById(EstudianteHacerDescanso_PK id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(EstudianteHacerDescanso_PK id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return ehdr.count();
	}

	@Override
	public void deleteById(EstudianteHacerDescanso_PK id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(EstudianteHacerDescansoRepository entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends EstudianteHacerDescanso_PK> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends EstudianteHacerDescansoRepository> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EstudianteHacerDescansoRepository> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<EstudianteHacerDescansoRepository> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends EstudianteHacerDescansoRepository, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
