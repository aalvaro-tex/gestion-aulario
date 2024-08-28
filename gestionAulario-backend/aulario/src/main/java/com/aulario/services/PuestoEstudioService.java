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

import com.aulario.entities.PuestoEstudio;
import com.aulario.entities.PKs.PuestoEstudio_PK;
import com.aulario.repositories.PuestoEstudioRepository;

public class PuestoEstudioService implements PuestoEstudioRepository{

	@Autowired
	private PuestoEstudioRepository per;
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends PuestoEstudio> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PuestoEstudio> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<PuestoEstudio> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<PuestoEstudio_PK> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PuestoEstudio getOne(PuestoEstudio_PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PuestoEstudio getById(PuestoEstudio_PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PuestoEstudio getReferenceById(PuestoEstudio_PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PuestoEstudio> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PuestoEstudio> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PuestoEstudio> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PuestoEstudio> findAll() {
		// TODO Auto-generated method stub
		return per.findAll();
	}

	@Override
	public List<PuestoEstudio> findAllById(Iterable<PuestoEstudio_PK> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PuestoEstudio> S save(S entity) {
		// TODO Auto-generated method stub
		return per.save(entity);
	}

	@Override
	public Optional<PuestoEstudio> findById(PuestoEstudio_PK id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(PuestoEstudio_PK id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return per.count();
	}

	@Override
	public void deleteById(PuestoEstudio_PK id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PuestoEstudio entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends PuestoEstudio_PK> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends PuestoEstudio> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PuestoEstudio> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PuestoEstudio> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PuestoEstudio> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends PuestoEstudio> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PuestoEstudio> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends PuestoEstudio> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends PuestoEstudio, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
