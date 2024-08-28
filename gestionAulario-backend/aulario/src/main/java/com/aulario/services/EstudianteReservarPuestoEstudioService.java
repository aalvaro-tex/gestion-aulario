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

import com.aulario.entities.EstudianteReservarPuestoEstudio;
import com.aulario.repositories.EstudianteReservarPuestoEstudioRepository;

public class EstudianteReservarPuestoEstudioService implements EstudianteReservarPuestoEstudioRepository{

	@Autowired
	private EstudianteReservarPuestoEstudioRepository erper;
	
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<EstudianteReservarPuestoEstudio> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<EstudianteReservarPuestoEstudio> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EstudianteReservarPuestoEstudio getOne(EstudianteReservarPuestoEstudio id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstudianteReservarPuestoEstudio getById(EstudianteReservarPuestoEstudio id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstudianteReservarPuestoEstudio getReferenceById(EstudianteReservarPuestoEstudio id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstudianteReservarPuestoEstudio> findAll() {
		// TODO Auto-generated method stub
		return erper.findAll();
	}

	@Override
	public List<EstudianteReservarPuestoEstudio> findAllById(Iterable<EstudianteReservarPuestoEstudio> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio> S save(S entity) {
		// TODO Auto-generated method stub
		return erper.save(entity);
	}

	@Override
	public Optional<EstudianteReservarPuestoEstudio> findById(EstudianteReservarPuestoEstudio id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(EstudianteReservarPuestoEstudio id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return erper.count();
	}

	@Override
	public void deleteById(EstudianteReservarPuestoEstudio id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(EstudianteReservarPuestoEstudio entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends EstudianteReservarPuestoEstudio> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends EstudianteReservarPuestoEstudio> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EstudianteReservarPuestoEstudio> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<EstudianteReservarPuestoEstudio> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends EstudianteReservarPuestoEstudio, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
