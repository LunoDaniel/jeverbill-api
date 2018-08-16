package br.com.jeverbill.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jeverbill.domain.Bill;
import br.com.jeverbill.repository.interfaces.Bills;
import br.com.jeverbill.service.interfaces.BaseService;

@Service
public class BillService implements BaseService<Bill>{

	@Autowired
	private Bills billRepository;
	
	@Override
	public Bill save(Bill entity) {
		return billRepository.save(entity);
	}

	@Override
	public Bill findOne(Long id) {
		Optional<Bill> optionalBill = billRepository.findById(id);
		return optionalBill.isPresent() ?  optionalBill.get() : new Bill();
	}

	@Override
	public List<Bill> findAll() {
		return (List<Bill>) billRepository.findAll();
	}

	@Override
	public void delete(Bill entity) {
		billRepository.delete(entity);
	}

}
