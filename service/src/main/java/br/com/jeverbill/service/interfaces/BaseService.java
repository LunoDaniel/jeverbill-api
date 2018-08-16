package br.com.jeverbill.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jeverbill.service.exceptions.BusinessException;

@Service
public interface BaseService<T> {
	
	public T save(T entity) throws BusinessException;
	public T findOne(Long id) throws BusinessException;
	public List<T> findAll() throws BusinessException;
	public void delete(T entity) throws BusinessException;
	
}
