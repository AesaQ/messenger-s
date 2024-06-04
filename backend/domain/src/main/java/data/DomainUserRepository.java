package data;

import data.base.Repository;
import entity.DomainUser;
import entity.communicate.DomainCommunicate;

import java.util.List;

public interface DomainUserRepository extends Repository<DomainUser> {
    @Override
    void save(DomainUser entity);

    @Override
    DomainUser findById(Long id);

    @Override
    List<? extends DomainUser> findAll();

    @Override
    void update(DomainUser entity);

    @Override
    void deleteById(Long id);

    @Override
    boolean existsById(Long id);

    List<? extends DomainCommunicate> getCommunicateListByUserId(Long id);
}
