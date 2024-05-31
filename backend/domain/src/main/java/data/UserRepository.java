package data;

import data.base.Repository;
import entity.User;

import java.util.List;

public interface UserRepository extends Repository<User> {
    void create(User User);

    User getById(long id);

    List<User> getAll();

    void update(User User);

    void delete(long id);

    List<User> search(String query);

    List<User> getByChat(long chatId);

    List<User> getByChannel(long chatId);

    List<User> getUnreadUsers(long userId);
}
