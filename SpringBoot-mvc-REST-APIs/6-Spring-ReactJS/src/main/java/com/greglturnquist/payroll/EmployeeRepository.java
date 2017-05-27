package com.greglturnquist.payroll;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Surreallistic on 29.03.2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
