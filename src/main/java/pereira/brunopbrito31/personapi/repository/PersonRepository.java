package pereira.brunopbrito31.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pereira.brunopbrito31.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
