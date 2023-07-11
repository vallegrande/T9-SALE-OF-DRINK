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

import com.saleofdrink.model.VentaDetalle;
import com.saleofdrink.repository.VentaDetalleRepository;

@Service
public class VentaDetalleService implements VentaDetalleRepository {

	@Autowired
	private VentaDetalleRepository ventaDetalleRepository;

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends VentaDetalle> S saveAndFlush(S entity) {
		return ventaDetalleRepository.save(entity);
	}

	@Override
	public <S extends VentaDetalle> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<VentaDetalle> entities) {
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
	public VentaDetalle getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VentaDetalle getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VentaDetalle getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VentaDetalle> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VentaDetalle> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VentaDetalle> List<S> saveAll(Iterable<S> entities) {

		return null;
	}

	@Override
	public List<VentaDetalle> findAll() {
		return ventaDetalleRepository.findAll();
	}

	@Override
	public List<VentaDetalle> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VentaDetalle> S save(S entity) {
		return ventaDetalleRepository.save(entity);
	}

	@Override
	public Optional<VentaDetalle> findById(Long id) {
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
		ventaDetalleRepository.deleteById(id);

	}

	@Override
	public void delete(VentaDetalle entity) {
		ventaDetalleRepository.delete(entity);

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends VentaDetalle> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<VentaDetalle> findAll(Sort sort) {
		return ventaDetalleRepository.findAll(sort);
	}

	@Override
	public Page<VentaDetalle> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VentaDetalle> Optional<S> findOne(Example<S> example) {
		return Optional.empty();
	}

	@Override
	public <S extends VentaDetalle> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VentaDetalle> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends VentaDetalle> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends VentaDetalle, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<VentaDetalle>findAllByEstvendet(String estvendet, Pageable pageable) {
		return ventaDetalleRepository.findAllByEstvendet(estvendet, pageable);
	}

}
