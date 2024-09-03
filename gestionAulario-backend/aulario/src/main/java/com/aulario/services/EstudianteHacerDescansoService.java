package com.aulario.services;

import java.util.ArrayList;
import java.util.Collections;
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

import com.aulario.entities.EstudianteHacerDescanso;
import com.aulario.repositories.EstudianteHacerDescansoRepository;



@Service
public class EstudianteHacerDescansoService implements EstudianteHacerDescansoRepository{

	private Logger log = Logger.getLogger(EstudianteHacerDescansoService.class.getName());
	
	@Autowired
	private EstudianteHacerDescansoRepository ehdr;
	
	// custom
	public List<EstudianteHacerDescanso> findDescansosByNie(String nie){
		List<EstudianteHacerDescanso> all = this.findAll();
		List<EstudianteHacerDescanso> descansosForNie = new ArrayList<EstudianteHacerDescanso>();
			for(int i = 0; i < all.size(); i ++) {
			if(all.get(i).getNie().equalsIgnoreCase(nie)) {
				descansosForNie.add(all.get(i));
			}
		}
		return descansosForNie;
		}


	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public <S extends EstudianteHacerDescanso> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EstudianteHacerDescanso> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteAllInBatch(Iterable<EstudianteHacerDescanso> entities) {
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
	public EstudianteHacerDescanso getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public EstudianteHacerDescanso getById(Long id) {
		// TODO Auto-generated method stub
		return ehdr.getById(id);
	}


	@Override
	public EstudianteHacerDescanso getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EstudianteHacerDescanso> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EstudianteHacerDescanso> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EstudianteHacerDescanso> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<EstudianteHacerDescanso> findAll() {
		// TODO Auto-generated method stub
		return ehdr.findAll();
	}


	@Override
	public List<EstudianteHacerDescanso> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EstudianteHacerDescanso> S save(S entity) {
		// TODO Auto-generated method stub
		return ehdr.save(entity);
	}


	@Override
	public Optional<EstudianteHacerDescanso> findById(Long id) {
		// TODO Auto-generated method stub
		return ehdr.findById(id);
	}
	

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return ehdr.count();
	}


	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(EstudianteHacerDescanso entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll(Iterable<? extends EstudianteHacerDescanso> entities) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<EstudianteHacerDescanso> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Page<EstudianteHacerDescanso> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EstudianteHacerDescanso> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}


	@Override
	public <S extends EstudianteHacerDescanso> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends EstudianteHacerDescanso> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public <S extends EstudianteHacerDescanso> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public <S extends EstudianteHacerDescanso, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
