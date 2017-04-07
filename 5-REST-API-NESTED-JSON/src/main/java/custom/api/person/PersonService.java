package custom.api.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz S. on 07.04.2017.
 */

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public List<Person> getAllPersons(){
        List<Person> list = new ArrayList<>();
        for(Person nest : repository.findAll()){
            list.add(nest);
        }
        return list;
    }

    public List<Person> getPersonById(long id){
        List<Person> list = new ArrayList<>();
        list.add(repository.findOne(id));
        return list;
    }

    public void addPerson(Person e) {
        Person insertEcoEvents = new Person(
                e.getName()
        );
        repository.save(insertEcoEvents);
    }

    public void editPersonById(Person e, long id) {
        Person editEcoEvents = new Person(
                id, e.getName()
        );
        repository.save(editEcoEvents);
    }

    public void deletePersonById(@RequestParam("id") long id){
        repository.delete(id);
    }
}
