package custom.api.person.interests;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
public interface InterestsRepository extends CrudRepository<Interests, String> {
    public List<Interests> findByName(String name);
}