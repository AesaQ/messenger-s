package data;

import data.base.Repository;
import entity.User;
import entity.communicate.DomainCommunicate;

import java.util.List;

public interface DomainUserRepository extends Repository<User> {
    void create(User User);

    User getById(long id);

    List<User> getAll();

    void update(User User);

    void delete(long id);

    List<User> search(String query);

    List<User> getByChat(long chatId);

    List<User> getByChannel(long chatId);

    List<User> getUnreadUsers(long userId);

    List<? extends DomainCommunicate> getCommunicateListByUserId(Long id);
}
