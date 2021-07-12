package pereira.brunopbrito31.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pereira.brunopbrito31.personapi.dto.MessageResponseDTO;
import pereira.brunopbrito31.personapi.dto.request.PersonDTO;
import pereira.brunopbrito31.personapi.entity.Person;
import pereira.brunopbrito31.personapi.mapper.PersonMapper;
import pereira.brunopbrito31.personapi.repository.PersonRepository;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID "+savedPerson.getId())
                .build();
    }
}
