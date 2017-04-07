package custom.api.person;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
}