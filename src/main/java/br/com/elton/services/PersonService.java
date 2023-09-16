package br.com.elton.services;

import br.com.elton.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {
    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person){
        Person personReturn = new Person();

        personReturn.setId(counter.incrementAndGet());
        personReturn.setFirstName(person.getFirstName());
        personReturn.setLastName(person.getLastName());
        personReturn.setAddress(person.getAddress());
        personReturn.setGender(person.getGender());
        return personReturn;
    }
    public Person update(Person person){
        Person personReturn = new Person();

        personReturn.setId(counter.incrementAndGet());
        personReturn.setFirstName(person.getFirstName());
        personReturn.setLastName(person.getLastName());
        personReturn.setAddress(person.getAddress());
        personReturn.setGender(person.getGender());
        return personReturn;
    }

    public void delete(String id){
    }

    public Person findByID(String id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Elton");
        person.setLastName("Oliveira");
        person.setAddress("Ilhota - Santa Catarina - Brasil");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name" + i);
        person.setLastName("Last name" + i);
        person.setAddress("Some address in Brasil" + i);
        person.setGender("Male" + i);
        return person;
    }
}
