package serviceImpl;

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Override
    public Person findPersonById(Integer id) {
        return new Person(1,"test",12);
    }
}
