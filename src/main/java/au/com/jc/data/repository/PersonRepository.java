package au.com.jc.data.repository;

import au.com.jc.data.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p WHERE LOWER(p.name) = LOWER(:name)")
    List<Person> findByNameIgnoreCase(String name);
}
