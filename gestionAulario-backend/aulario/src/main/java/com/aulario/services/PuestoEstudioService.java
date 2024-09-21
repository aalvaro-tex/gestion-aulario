package com.aulario.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.aulario.entities.PuestoEstudio;
import com.aulario.repositories.PuestoEstudioRepository;

@Service
public class PuestoEstudioService implements PuestoEstudioRepository{

	@Autowired
	private PuestoEstudioRepository per;
	
	private Logger log = Logger.getLogger(EstudianteHacerDescansoService.class.getName());

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
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
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
	public List<PuestoEstudio> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends PuestoEstudio> S save(S entity) {
		// TODO Auto-generated method stub
		return per.save(entity);
	}



	@Override
	public long count() {
		// TODO Auto-generated method stub
		return per.count();
	}

	@Override
	public void delete(PuestoEstudio entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
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
	
	public List<PuestoEstudio> getPuestosBySala(int sala){
		List<PuestoEstudio> all = this.findAll();
		List<PuestoEstudio> encontrado = new ArrayList<PuestoEstudio>();
		for(PuestoEstudio p : all) {
			if(p.getNum_sala() == sala) encontrado.add(p);
		}
		log.info("Se han encontrado " +encontrado.size() +" puestos en la sala " + sala);
		return encontrado;
	}

	@Override
	public PuestoEstudio getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PuestoEstudio getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PuestoEstudio getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PuestoEstudio> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
