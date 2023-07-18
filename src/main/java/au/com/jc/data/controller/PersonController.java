package au.com.jc.data.controller;

import au.com.jc.data.model.Person;
import au.com.jc.data.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<List<Person>> getAllPerson() {
        List<Person> personList = personRepository.findAll();
        return new ResponseEntity<>(personList, HttpStatus.OK);
    }

    @GetMapping(value = "/{name}", produces = "application/json")
    public ResponseEntity<List<Person>> getPerson(@PathVariable String name) {

        List<Person> personList = personRepository.findByNameIgnoreCase(name);
        return new ResponseEntity<>(personList, HttpStatus.OK);
    }
}
