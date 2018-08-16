package br.com.jeverbill.repository.interfaces;

import org.springframework.stereotype.Repository;

import br.com.jeverbill.domain.Bill;

@Repository
public interface Bills extends BaseRepository<Bill, Long> {

}
