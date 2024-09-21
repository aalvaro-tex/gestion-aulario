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

import com.aulario.entities.Descanso;
import com.aulario.repositories.DescansoRepository;

@Service
public class DescansoService implements DescansoRepository{
	
	@Autowired
	private DescansoRepository dr;
	
	private Logger log = Logger.getLogger(DescansoService.class.getName());

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Descanso> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Descanso> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Descanso> entities) {
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
	public Descanso getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Descanso getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Descanso getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Descanso> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Descanso> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Descanso> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Descanso> findAll() {
		// TODO Auto-generated method stub
		log.info("Hay " + this.count() + " tipos de descanso registrados");
		return dr.findAll();
	}

	@Override
	public List<Descanso> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Descanso> S save(S entity) {
		// TODO Auto-generated method stub
		return dr.save(entity);
	}

	@Override
	public Optional<Descanso> findById(Long id) {
		// TODO Auto-generated method stub
		return dr.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return dr.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dr.deleteById(id);
	}

	@Override
	public void delete(Descanso entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Descanso> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Descanso> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Descanso> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Descanso> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Descanso> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Descanso> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Descanso> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Descanso, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Descanso findByNombre(String nombre) {
		Descanso d = null;
		List<Descanso> all = this.findAll();
		for(Descanso des : all) {
			if(des.getNombre().equalsIgnoreCase(nombre)) d = des;
		}
		return d;
	}
	
	public void deleteByName(String nombre) {
		Long id = this.findByNombre(nombre).getId();
		log.info("Se va a eliminar el descanso con nombre: "+nombre);
		this.deleteById(id);
	}
	
	public boolean editDuracion(String nombre, int duracion) {
		Descanso d = this.findByNombre(nombre.toUpperCase());
		try {
		d.setDuracion(duracion);
		this.save(d);
		return true;
		} catch(Exception e) {
			log.info("No se ha encontrado el descanso con nombre "+ nombre);
			return false;
		}

	}

}
