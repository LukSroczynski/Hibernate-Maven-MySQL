package custom.api.person.interests;

import custom.api.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lukasz S. on 05.04.2017.
 */
@RestController
public class InterestsController {

    @Autowired
    InterestsService repository;

    @RequestMapping(value = "/person/{id}/interests", method = RequestMethod.GET)
    public List<Interests> getAllInterests(@PathVariable String id){
        return repository.getAllInterests(id);
    }

    @RequestMapping(value = "/person/{personId}/interests/{id}", method = RequestMethod.GET)
    public Interests getInterestById(@PathVariable String id){
        return repository.getInterestsById(id);
    }

    @RequestMapping(value = "/person/{personId}/interests", method = RequestMethod.POST)
    public void addInterest(@RequestBody Interests interests, @PathVariable long personId) {
        interests.setPerson(new Person(personId, ""));
        repository.addInterests(interests);
    }

    @RequestMapping(value = "/person/{personId}/interests/{id}", method = RequestMethod.PUT)
    public void editInterestById(@RequestBody Interests interests, @PathVariable long personId, @PathVariable String id) {
        interests.setPerson(new Person(personId, ""));
//        repository.editInterestById(interests, );
    }

    @RequestMapping(value = "/interests", method = RequestMethod.DELETE)
    public void deleteInterestById(@RequestParam("id") String id){
        repository.deleteInterests(id);
    }
}
