package ru.beljankin.spring.dao;

import ru.beljankin.spring.model.Person;

public interface PersonDAO {
    Person select(int id);
    void save(Person person);
    void delete(int id);
    void update(int id, Person person);
}
