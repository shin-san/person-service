package au.com.jc.data.controller;

import au.com.jc.data.model.Social;
import au.com.jc.data.repository.SocialRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@Slf4j
@RestController
@RequestMapping("/social")
public class SocialController {

    @Autowired
    SocialRepository socialRepository;

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<List<Social>> getAllSocial() {
        List<Social> socialList = socialRepository.findAll();
        return new ResponseEntity<>(socialList, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Optional<Social>> getSocialById(@PathVariable long id) {
        Optional<Social> socials = socialRepository.findById(id);

        return new ResponseEntity<>(socials, HttpStatus.OK);
    }
}
