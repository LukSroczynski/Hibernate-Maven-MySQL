package custom.api.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
@RestController
public class PersonController {

    @Autowired
    PersonService repository;

    @RequestMapping(value = "/person", method = RequestMethod.GET, params = "all")
    public List<Person> getAllPersons(){
        return repository.getAllPersons();
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET, params = "id")
    public List<Person> getPersonById(@RequestParam("id") long id){
        return repository.getPersonById(id);
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST, params = "create_new")
    public void addPerson(@RequestBody Person e) {
        repository.addPerson(e);
    }

    @RequestMapping(value = "/person", method = RequestMethod.PUT, params = "id")
    public void editPersonById(@RequestBody Person e, @RequestParam("id") long id) {
        repository.editPersonById(e, id);
    }

    @RequestMapping(value = "/person", method = RequestMethod.DELETE, params = "id")
    public void deletePersonById(@RequestParam("id") long id){
        repository.deletePersonById(id);
    }
}
