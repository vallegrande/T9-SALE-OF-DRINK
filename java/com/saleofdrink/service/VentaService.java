package com.saleofdrink.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.saleofdrink.model.Venta;
import com.saleofdrink.repository.VentaRepository;

@Service
public class VentaService implements VentaRepository {

	@Autowired
	private VentaRepository ventaRepository;

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Venta> S saveAndFlush(S entity) {
		return ventaRepository.save(entity);
	}

	@Override
	public <S extends Venta> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Venta> entities) {
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
	public Venta getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venta getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Venta getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Venta> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Venta> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Venta> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venta> findAll() {
		return ventaRepository.findAll();
	}

	@Override
	public List<Venta> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Venta> S save(S entity) {
		return ventaRepository.save(entity);
	}

	@Override
	public Optional<Venta> findById(Long id) {
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		ventaRepository.deleteById(id);

	}

	@Override
	public void delete(Venta entity) {
		ventaRepository.delete(entity);

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Venta> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Venta> findAll(Sort sort) {
		return ventaRepository.findAll(sort);
	}

	@Override
	public Page<Venta> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Venta> Optional<S> findOne(Example<S> example) {
		return Optional.empty();
	}

	@Override
	public <S extends Venta> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Venta> long count(Example<S> example) {
		return 0;
	}

	@Override
	public <S extends Venta> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Venta, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Venta> findAllByEstven(String estven, Pageable pageable) {
		return ventaRepository.findAllByEstven(estven, pageable);
	}

}
