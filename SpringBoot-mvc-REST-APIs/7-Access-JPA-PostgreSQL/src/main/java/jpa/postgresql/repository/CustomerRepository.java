package jpa.postgresql.repository;

import jpa.postgresql.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
