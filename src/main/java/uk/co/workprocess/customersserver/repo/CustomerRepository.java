package uk.co.workprocess.customersserver.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import uk.co.workprocess.customersserver.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}
