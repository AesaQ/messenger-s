package data;


import data.base.Repository;
import entity.DomainMessage;

import java.util.List;

public interface DomainMessageRepository extends Repository<DomainMessage> {
    @Override
    void save(DomainMessage entity);

    @Override
    DomainMessage findById(Long id);

    @Override
    List<? extends DomainMessage> findAll();

    List<? extends DomainMessage> findListByCommunicateId(Long communicateId);

    @Override
    void update(DomainMessage entity);

    @Override
    void deleteById(Long id);

    @Override
    boolean existsById(Long id);
}
