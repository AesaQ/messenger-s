package repository;

import data.DomainCommunicateRepository;
import entity.Communicate;
import entity.communicate.DomainCommunicate;

import java.util.List;

public class CommunicateRepository implements DomainCommunicateRepository {
    private final SpringCommunicateRepository springCommunicateRepository;

    public CommunicateRepository(SpringCommunicateRepository springCommunicateRepository) {
        this.springCommunicateRepository = springCommunicateRepository;
    }

    @Override
    public void save(DomainCommunicate entity) {

    }

    @Override
    public Communicate findById(Long id) {
        return null;
    }

    @Override
    public List<? extends DomainCommunicate> findAll() {
        return null;
    }

    @Override
    public void update(DomainCommunicate entity) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }
}
