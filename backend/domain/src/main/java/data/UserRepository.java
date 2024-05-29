package data;

import ru.AesaQ.domain.data.base.Repository;
import ru.AesaQ.domain.entity.Person;

import java.util.List;

public interface UserRepository extends Repository<Person> {
    void create(Person person);

    Person getById(long id);

    List<Person> getAll();

    void update(Person Person);

    void delete(long id);

    List<Person> search(String query);

    List<Person> getByChat(long chatId);

    List<Person> getByChannel(long chatId);

    List<Person> getUnreadPersons(long userId);
}
