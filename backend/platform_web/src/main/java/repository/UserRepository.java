package repository;

import data.DomainUserRepository;
import entity.Communicate;
import entity.DomainUser;
import entity.User;
import entity.communicate.DomainCommunicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserRepository implements DomainUserRepository {

    private final SpringUserRepository springUserRepository;
    private final CommunicateRepository communicateRepository;

    @Autowired
    public UserRepository(SpringUserRepository springUserRepository, CommunicateRepository communicateRepository) {
        this.springUserRepository = springUserRepository;
        this.communicateRepository = communicateRepository;
    }

    @Override
    public void save(DomainUser entity) {

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
    public void update(DomainUser User) {

    }

    @Override
    public void deleteById(Long id) {

    }
    @Override
    public boolean existsById(Long id) {
        return false;
    }
    @Override
    public List<? extends DomainCommunicate> getCommunicateListByUserId(Long id) {

        Optional<User> optionalUser = springUserRepository.findById(id);
        User user = optionalUser.get();

        List<Long> communicateIDs = user.getCommunicateIDs();
        List<Communicate> resultList = new ArrayList<>();
        communicateIDs.forEach(communicateID ->
                resultList.add(communicateRepository.findById(communicateID))
        );
        return resultList;
    }
}
