package com.vlad.hr.repo;

import com.vlad.hr.models.Persons;
import org.springframework.data.repository.CrudRepository;

public interface PersonsRepository extends CrudRepository<Persons, Long> {
}
