package custom.api.person.interests;

import custom.api.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class InterestsService {

    @Autowired
    InterestsRepository repository;

    public List<Interests> getAllInterests(String id){
        List<Interests> list = new ArrayList<>();
        repository.findByName(id)
                .forEach(list::add);
        return list;
    }

    public Interests getInterestsById(String id){
        repository.findByName("");
        return repository.findOne(id);
    }

    public void addInterests(Interests e) {
        repository.save(e);
    }

    public void editInterestById(Interests e, long id) {

    }

    public void deleteInterests(@RequestParam("id") String id){
        repository.delete(id);
    }
}
