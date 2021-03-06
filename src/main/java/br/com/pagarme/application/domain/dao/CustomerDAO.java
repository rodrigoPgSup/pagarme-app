package br.com.pagarme.application.domain.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pagarme.application.domain.entity.Customer;
import br.com.pagarme.application.domain.entity.User;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Long>{

	@Transactional
	Customer findByUser(User user);
}
