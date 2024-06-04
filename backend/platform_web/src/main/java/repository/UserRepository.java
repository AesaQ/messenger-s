package repository;

import data.DomainUserRepository;
import entity.User;
import entity.communicate.DomainCommunicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepository implements DomainUserRepository {

    private SpringUserRepository springUserRepository;

    @Autowired
    public UserRepository(SpringUserRepository springUserRepository) {
        this.springUserRepository = springUserRepository;
    }

    @Override
    public void create(User User) {

    }

    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void save(User entity) {

    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<? extends User> findAll() {
        return null;
    }

    @Override
    public void update(User User) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<User> search(String query) {
        return null;
    }

    @Override
    public List<User> getByChat(long chatId) {
        return null;
    }

    @Override
    public List<User> getByChannel(long chatId) {
        return null;
    }

    @Override
    public List<User> getUnreadUsers(long userId) {
        return null;
    }

    @Override
    public List<? extends DomainCommunicate> getCommunicateListByUserId(Long id) {
        return;
    }
}
